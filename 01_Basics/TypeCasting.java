public class TypeCasting {
    public static void main(String[] args){
        byte b = 127; //max value of byte
        int a = 256;

        // b = a; cannot convert from int to byte (larger to smaller)
        // a = b; possible as byte to int (smaller to larger)



        // to convert from bigger range to smaller i.e. int to byte, we have to explicitly convert it 
        // with a method know as type casting
        b = (byte)a; 
        System.out.println(b); //output would be zero


        float f = 5.6f;
        int x = (int)f;
        System.out.println(x); //output would be the integral part of the float number
        // which means 5.6 will give 5 as output

        byte p = 10;
        byte q = 30;
        System.out.println(p*q); //it will print 300 which is out of the range of byte
        // in java it auto upgrades these values
    }
    
}
