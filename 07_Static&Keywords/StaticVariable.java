class Mobile{
    String brand;
    int price;
    static String name; //static is used

    /* we cannot create a static variable inside a method, it should be declared outside the method in a class, and once a instance varible is made 
    it's no longer a static variable it's class variable */

    /* by help of static keyword we are making it a class member not an object member */
    

    /* if we use static variable then for every object using this class 
    would have the same value of this variable, if we update the value of this static variable for one object
    then it would change the value for this same variable for every object */

    public void show(){ //a function to print every detail
        System.out.println(brand + " : " + price + " : " + name);
        //to use static variable methods not need to be static as well
    }
}


public class StaticVariable {


    public static void main(String a[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "iphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        obj1.name = "Phone"; //here we updated the instance variable name to phone only for obj1 but now if we print the name value for obj2 it would also be updated
        Mobile.name = "Phone"; //explanation for this line is given below the second para


        obj1.show();
        obj2.show();

        /* if we haven't used static then both object would print different name as we filled different name to them
        but once it become staic, now changing its value would change the variable to same value for every place where this variable was used */




        /* as this instance variable is going to be same for every object we don't have to call it using object name (obj1.name)
        we can call it by its class name (Mobile.name) */

        //Mobile.price = 200; this won't be possible as price is not a static variable we cannot use class name instead of object name




        //static varible is shared by diffrent objects

        /* static variable remains static only for those objects which uses same classs in which static variable was created as a instance variable
        if we create a different class and give the same static instance varibale 'name' in it and create a obj3 and gives it some name like "sphone" 
        so at the end when we are changing the value of name to phone and printing and it would change the name for obj1 obj2 but not for obj3 as obj3
        is of different class*/
    }
}
