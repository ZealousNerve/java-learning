public class MutableAndImmutableString {
    public static void main(String[] args) {
        String name = "Navin";
        name = name + " Reddy"; //same as numbers we can change the value of variable with string datatypes
        // here in above code we are creating a new object
        System.out.println("hello " + name);


        String s1 = "Navin"; //n is capital
        String s2 = "Navin"; 
        /*both s1 and s2 are having same string value, and here we see there are two s1 and s2 but it doesn't mean that
          we are creating two objects, there is only one object, both s1 and s2 will have the same address in the heap

          in heap it will first look for navin if it is not there, it will create and store it in name, then it will check  
          for Navin it is not there so it will create a address for that Navin and stores it in s1, then again checks for 
          Navin for s2 but now Navin is already there so no new object will be created, the old address will be same for the 
          new one, and through this way we are saving a lot of memory

          and for all this shit java used something called as "String Constant Pool"
         */
        System.out.println(s1 == s2);//this will print true as they are equal



        /*Mutable String: string which can be changed. java provides two calsses for mutable string known as String buffer and String builder*/


        /*
        Immutable String: string which can't be changed, once we create an object we can't change so it become immutable
        when we change it will create a new object, by default string in java is immutable. here the code shown below shows it perfectly
        */

        String p1 = "Hello";
        String p2 = p1;      // s2 also references "Hello"

        p1 = p1 + " World";  // Creates a NEW object "Hello World"

        System.out.println(p1); // Output: Hello World
        System.out.println(p2); // Output: Hello

    }
}
