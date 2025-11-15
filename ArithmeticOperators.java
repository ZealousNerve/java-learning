public class ArithmeticOperators {
    public static void main(String args[]){
        int a = 5;
        int b = 2;
        int r1= a + b;
        int r2 = a *b;
        int r3 = a-b;
        int r4 = a/b; //it gives quoteint as output
        int r5 = a%b; //it gives remainder as output


        a = a + 2;
        a += 2; //increment by 2
        a++; // increment by 1 (postincrement and preincrement shit)

        System.out.printf("%d\n %d\n %d\n %d\n %d\n", r1, r2, r3, r4, r5);
    }
    
}
