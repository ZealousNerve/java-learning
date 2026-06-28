class Human{
    private int age;
    private String name;


    public int getAge(){ // seperate method to get acess of age- this method is known as getters
        return age; //age variable which is private, can be used as the method is in the same class
    }

    public String getName(){ //seperate method to get access of name
        return name; 
    }

    public void setAge(int age){ //seperate method to assign the value of age- this method is know as setters

        //age = age; 

        /* here one age is intance variable which is used by the object and the other age is local variable used as refrence
        but in the above line of code both age is local variable as local variable is given more priority in java, and this creates a lots of confusion
        and to get rid of it "this" keyword is used*/

        this.age = age;
        /* this keywords tells that this age is of object, and by object i mean the object which is going to call this method, so now this age is instance
        variable and the other age is local variable */

    }

    public void setName(String n){ //seperate method to assign the value of name
        name = n;
        //we can use different names for instance variable and local variable(n), then no need to use this keyword
    }
}




public class Encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();

        obj.setAge(30);         //method used to set age
        obj.setName("Reddy");   //method used to set name

        obj.getAge();             // mehtod used to get age
        obj.getName();            // method used to get name

        // getAge setAge are just name, not necessary to use get and set keywords but as for the ease of redability we should use that name

        //now as the variable is made private, now all this object codes will show errors
        // obj.age = 11;
        // obj.name = "Navin";

        /* suppose we want to make our details private, so that no one can access it directly then we can use encapsulation
         in encapsulation we first make a variable or instance variable private, and now that variable can be accessed only through the same class
         no one outside the class can access that data
         
         to access the data such as to assign the value to that private or encapsulated variable we need to create a seperate method and to access the variable
         we again need to create a seperate method, in out example the get and set method is used to access the variable*/


        /*  it's not that only variable can be encapsulated, 
            encapsulated variable can be accessed by public mehtod in the same class
            encapsulated methods can be accessed by othe public method in the same class
            inner helper class, or we can say class inside a class, so inner class can be also encapsulated
            
            
            In Java, this is achieved using:
                Access modifiers (private, protected, public)
                Classes
                Methods (especially getters/setters)
        */
    }
}
