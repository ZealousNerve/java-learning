//Read static variable first to understand properly


class Mobile{
    String brand;
    int price;
    static String name; 


    static{   //this is a static block 
        name="Phone";
        System.out.println("in static block");
    }

    /* irrespective of how many objects we create a static block is called only once
    whereas the constructor given below can be called multiple times */

    /* there's an simple analogy that objects can be many but class for all of them would be one
    and hence static block is a class block and called first and only ones */


    public Mobile(){ //constructor with some intializations - this is known as defult constructor
        brand = "";
        price = 200;
        System.out.println("in constructor");

        /* constructors are like method but it will not return anything, it is compulsory to have the mame of constructor same as the name of class
        every time a obj is created a constructor is called*/
    }

    public Mobile(int price, String brand){           // this is known as parametrized constructor coz of parameters
            this.brand = brand; //this keyword is already explained
            this.price = price;
    }

    //and similar to method overloading we can do the same in constructor,(method overloading - same name, different parameters)





    public void show(){ 
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class StaticBlock {


    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "iphone";

        Mobile obj2 = new Mobile(1700, "nokia"); //parametrized constructor is used

        //two objects are created one with some value and other obj2 with default values, and as two objects are there
        //the constructor would be call twice whereas the static block would be called only once, that too when a class loads


        /* as there is a print function in both constructor and static block to print the place where they are present, and 
        as the constructor is called twice while object creation it will print twice and the static block would print only once
        and no matter what's the order of writtng the code the static block always runs first as first the class loads then the object loads */

        // static block runs even before the main, and it is used to intialize static variable, and can be used when we want to load something even before the main method

        /* 
            a simple analogy:
            static block - swtich on the main power supply
            constructor - turning on individual appliances
        */


        /* to understand the following statement comment out the code from line 52 to 57 and uncomment the line 82 the CLass.forName one

        now once commented no object is present there or we can say no object is created, and now when we run our code the constructor as well as the static block
        won't load or won't show the output, it means creation of object is required to load the class, and if we want to just load the class without creating an object
        we can use class class  given below */

        //Class.forName("Mobile"); 

        /* the above code is just used to load a class, here in the code "Class" is a class and forName is a method of class "Class" 
        writing only this line would throw an exception and to fix it we have written an extra line after the main(String a[]) 
        the extra line is 'throws CLassNotFoundException' */ 
        

    }
}
