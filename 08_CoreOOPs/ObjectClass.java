class Laptop{
    String model;
    int price;


    //here we have created our own toString method to override the default toString of object class
    public String toString(){ 
        return model + ":" + price;
    }
}



public class ObjectClass {
    public static void main(String[] args) {
        // as i mentioned earlier every class in java extends to object class and here we gonna talk about that

        Laptop obj = new Laptop();
        obj.model = "lenovo";
        obj.price = 1500;

        System.out.println(obj);
        System.out.println(obj.toString());
        //above two lines are same

        /* 
        
        by defuault if we aren't printing a single property of obj and instead we are printing just the obj
        it will print obj.toString() 
        
        toString will return 
        getClass().getName() + '@' + Integer.toHexString(hashCode())

        a hashcode is returned by deafault when we use toString, all these method are of object class and as every class extends to 
        object class we can use it, if instead of hash we want to return something else whenever we print obj then we can create a toString method of 
        our own in our class and it will override the toString method of object class and print out desired thing

        similar to this there are multiple prebuilt methods of object class which we can use, and if we don't like its operation
        we can override the default action by creating a method exactly same by ourselves, or we can right click on our IDE and
        generate source actions
        */
    }
}
