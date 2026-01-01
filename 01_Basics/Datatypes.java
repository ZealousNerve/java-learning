public class Datatypes {
    public static void main(String a[]){
        // int, float, character(2 bytes), boolean
        // int - byte(1 bytes), short(2 bytes), int(4 bytes), long(8 bytes)
        int num1 = 2;
        byte num2 = 3; // range from (-2^7 to 2^7 - 1 or we can say from -128 to +127)
        short num3 = 4;
        long num4 = 56l; //here we have to put a letter l after the number 

        // float - double, float
        float num5 = 4.5f; //here we have to write a letter f at the end
        double num6 = 5.6;

        char c = 'a'; // in single quotes
        c = c += 1; // output would be b

        boolean condition = true;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(c);
        System.out.println(condition);

    }
    
}
