import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListInJava {
    public static void main(String[] args) {

        // Using Collection interface as reference type
        // This gives flexibility (programming to interface)
        // but limits access to index-based methods.
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(6);   // duplicates are allowed in List-based collections

        // ArrayList overrides toString(), so elements are printed directly
        // Unlike arrays, no loop is needed just to display contents
        System.out.println(nums);

        /*
         In arrays, we must use a loop to print elements.
         In ArrayList, printing is easy because toString() is implemented.

         NOTE:
         Collection does NOT support index-based access (no get(), set()).
         Therefore, enhanced for-loop (for-each) is preferred.
        */

        // Since nums is Collection<Integer>, use Integer instead of Object
        // This avoids unnecessary casting and is type-safe
        for (Integer n : nums) {
            System.out.println(n * 2);
        }

        // If we want index-based access, we should use List interface
        // List extends Collection and adds methods like get(), set(), indexOf()
        List<Integer> num1 = new ArrayList<>();

        num1.add(6);
        num1.add(5);
        num1.add(8);
        num1.add(6);

        // Access element using index (only possible with List)
        System.out.println(num1.get(2));     // prints element at index 2 → 8

        // Finds index of first occurrence of the element
        System.out.println(num1.indexOf(5)); // prints index → 1

        /*
         Key Concept:
         - Collection → basic operations (add, remove, size)
         - List → ordered collection with index-based access
         - ArrayList → resizable array implementation of List
        */

        // Printing List also works due to overridden toString()
        System.out.println(num1);
    }
}
