public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        
        //string buffer is also datatypes
        StringBuffer sb = new StringBuffer("Navin"); //navin is of 5 char
        System.out.println(sb.capacity()); //to print the capacity which is 21(explanation is given below). 
        //string buffer will give us a buffer size of 16 characters

        System.out.println(sb.length()); // to print the length of string which is 5 in case of navin

        /*if our string is empty then the buffer size it will print will be 16, but after when we gave an intial
          string "navin", which is of 5 characters, now the buffer size will be 21(i.e. 16+5), after the string it gave us
          extra 16 char buffer size for any additional change which we can do as string buffer is an immutable string
         */

         
         //String Buffer

         sb.append('c');//it will add a char c at the end of sb that is navinc
         //we can try differnt fuction using the dot

         sb.append(" Reddy");//it will add a string reddy at the end of navinc(sb)
        
         System.out.println(sb); 

         //String str = sb; it will give an error as string buffer can't be converted into String both are different datatypes








    }
    
}
