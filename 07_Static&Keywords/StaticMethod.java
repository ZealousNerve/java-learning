//Read static variable first to understand properly


class Mobile{
    String brand;
    int price;
    static String name; 

    public void show(){ 
        System.out.println(brand + " : " + price + " : " + name);
        //non-static method can take normal as well as static variable also
    }

    public static void show1(){
        System.out.println(name);
        //static method can take only static variables, explanation given below
    }
}


public class StaticMethod {


    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "iphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        obj1.name = "Phone"; 
        Mobile.name = "Phone"; 


        obj1.show();
        obj2.show();

        Mobile.show1(); 
        //Mobile.show();it will show an error as show() is not a static method so it can't be called directly by class name, it should be called by using oject

        //similar to static variable in static method we can call the method just with the class no need for creating object to call it



        /* if the main method wouldn't be static then in order to call it we have to first create an object of out main class i.e. StaticMethod
        and as main is the starting point of code, without running then how can we create a object first, as main would be declared after creation of object
        
        and to get rid of this problem we use static keyword in main method*/




        /* static method can take only static variable as both are same for the class, as if we use non static variable in static method then how the method
        gonna know of which object this variable belong to
        
        we can use refrence to use non static variable in a static methond, call by refrence shit*/

    }
}
