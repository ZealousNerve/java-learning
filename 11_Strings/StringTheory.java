public class StringTheory {
    public static void main(String[] a) {
        //in java string is not just a datatype it is a class,
        //--and to use it we have to first create an object with properties of that class

        //beaware do not create a String class as it will conflict with java.lang.String

        //we can use string with only one operator i.e. (+)

      String name = new String("navin");  //in navin n is at index 0, a is at index 1, and so on

      String name1 = "Navin"; //we can use it also as a shortcut(it will create a object by its own)
      System.out.println(name1);

      System.out.println("hello " + name); //it will print navin
      System.out.println(name.hashCode()); //it will print 104593800
      System.out.println(name.charAt(1)); //it will print a 
      System.out.println(name.concat(" reddy")); //joins reddy with navin, print navin reddy

      
    }
    

}
