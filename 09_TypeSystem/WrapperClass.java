// A wrapper class in Java is a class that wraps a primitive data type into an object.
// primitive int has a predefined class named Integer, byte as Byte and so on....
// we can use it if we want to work on that by making it an object istead of primitive value
// for example a collection in java stores objects not primitives, and to use utility methods like parsing, conversions etc
// object can allow having null values ex. String but primitive can't

public class WrapperClass {
    public static void main(String[] args) {
        int num =7;
        Integer num1 = new Integer(num); //this method of assigning a primitive value to a object is known as boxing
        Integer num2 = num; //it creates the object automatically and hence known as autoboxing
        int num3 = num2; //auto-unboxing

        /* as we can see the Integer is strikethrough, the ide shows it is a deprecated method/variable/class
        it means we can use it now,, but ide suggest that we shouldn't use it as it may be removed in the future or
        a better alternative exists
        */  



        //UTILITY Methods

        String str = "12";
        int num4 = Integer.parseInt(str); //convert String into integer
        System.out.println(num4*2);
    }
}
