import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        
        System.out.print("Enter a number: ");

        //--------------------------------------------------------------------------------------------------------

        int num = System.in.read(); //it will throw a IO exception
        /* similar to system.out we have system.in but it will take only one char as input at a time */

        System.out.println(num); //it will print the ASCII value of the element taken as input

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num1 = Integer.parseInt(bf.readLine());
        /* this bf.readLine()  will take input as string so we need to parse it into int*/
        System.out.println(num1);
        bf.close();

        //----------------------------------------------------------------------------------------------------------------


        //SCANNER
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        sc.close();
    }
}
