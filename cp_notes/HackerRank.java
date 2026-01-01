import java.util.Scanner;

public class HackerRank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
            for(int i=0;i<3;i++){

                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.printf("%-15s%03d%n", s1, x);

                // %-15s -> Left-justify string in 15 characters, if the string is less than 15 char long then add spaces till 15 char
                // %03d -> Integer with minimum 3 digits, pad with 0 e.g. if number is 123 then output would be 123 and if num is 23 then output would be 023
                // %n -> new line
            }

                sc.close();
     }
}