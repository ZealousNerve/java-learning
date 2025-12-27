public class Literals {
    public static void main(String args[]){
        int num1 = 0b101; //b stands for binary and 101 is binary of 5
        int num2 = 0x7E; //x stands for hexadecinal, 7E is for 126

        System.out.printf("%d %d\n", num1, num2); 
        // printf is known as formatted print function 

        // i have used it coz print(arguments) or println(arguments) can print only
        // one argument at a time.

        int num3 = 10_00_000; // here underscores are just to have ease in couting number of zeroes
        // as the underscores wouldn't print

        System.out.println(num3);

        double num4 = 12e10; //output would be 1.2E11 (1.2 into 10 to the power 11 )
        System.out.println(num4);

        


    }
    
}
