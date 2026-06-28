/* by default enum in java extends to enum class only and that's why we can find various predefined
methods to work upon enums and this enum class can be verified using methods like getSuperclass() this
will print the name of super class of enum which is enum class 

enum cannot extends itself but can contains methods, constructors
enum can implement interfaces, */

enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);


    private int price;

    /* now every object in this enum has a price set what if we remove the brackets in front of Surface
    it will show an error as out code only have a parametrized constructor so we can make a default constructor then the
    error in writting just Surface instead of Surface(1500) will be gone */

    //as Macbook is a object so Macbook() is a constructor, so we have to define a constructor first

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() { //method getter to get the value
        return price;
    }

    
    
    /* if we don't define this constructor then the object will not know whats inside the brackets in their name
    in our case it is price */

    

}

public class EnumClass {
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap.getPrice());

        Laptop[] lap = Laptop.values();

        for(Laptop q: lap){
            System.out.println(q.getPrice());
        }
    }
}
