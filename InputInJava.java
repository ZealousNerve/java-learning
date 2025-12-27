import java.util.Scanner;

public class InputInJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("enter a number: ");
        int a = sc.nextInt();       // like scanf("%d", &a)

        System.out.print("enter a float value: ");
        float b = sc.nextFloat();   // like scanf("%f", &b)

        System.out.print("enter a name: ");
        String name = sc.next();    // like scanf("%s", name) single word

        System.out.print("enter a sentence: ");
        sc.nextLine(); 

        /* after we wrote anurag in the single word place, and pressed enter, so the new enter is not stored anywhere and when 
        we write String sentence = sc.nextLine() it takes that enter as input and woldn't let us write anything, it quickly move to 
        next step without taking our input, as it has taken previous enter key as input, and that's why we use sc.nextLine(); this before
        String sentence = sc.nextLine(); as sc.nextLine() this consumes all the previous enter keysss*/


        /* nextInt nextFloat next won't take previous leftovers as input(leftover example is enter key), but sc.nextLine() this take leftovers
         as input as well */

        String sentence = sc.nextLine();    // complete line 

        System.out.printf(" %d\n %.2f\n %s\n %s", a, b, name, sentence); // same printf style


        sc.close(); // as in the start we used system.in, which is a system resource so its good to close the scanner once done as to free up the system resources
    }
}