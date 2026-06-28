import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInJava {
    public static void main(String[] args) {
        //List based collection supported duplicates value
        //set supports unique value

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2); 
        nums.add(6); //it's a duplicate value and hence it will not be printed

        for(int n:nums){
            System.out.println(n);
        } 

        //set also not support index value
        //HashSet won't print sorted value, if we want to print sorted value use TreeSet

        Set<Integer> num1 = new TreeSet<Integer>();
        num1.add(62);
        num1.add(54);
        num1.add(81);
        num1.add(21); 
        num1.add(62);
        //now it will print sorted set in ascending order by default

        for(int n:num1){
            System.out.println(n);
        }


        //using iterator to print different element of a set

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        /* values.next() print a value and move to next element and hence it give only one value
        we are using a loop, and values.hasNext() checks weither there is a next element or not
        and that's why the while loop will work until there is no next element */
        
        
        

        
    }
}
