import java.util.Scanner;
public class test {
    public static void main(String args[]){

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int X = sc.nextInt();  // takes int input
        sc.close();  // always good to close scanner

        if(X>=1 && X<=31){
            if(X==25)
                System.out.println("Christmas");
            else
                System.out.println("Ordinary");

        }
         
    }
    
}
