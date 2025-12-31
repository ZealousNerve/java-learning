abstract class Car{ //abstract class
    public abstract void drive();
      /* we are only declaring a method here and we want that WangonR update this
      and to do that so we have to use abstract keyword, if we not use it we have declare it here
      but we want to declare it by different models like WagonR 
      
      next point is that a abstract method can be only inside a abstract class and hence we added
      the keyword abstract in front of car also
      
      next thing to remeber is that we cannot create object of an abstract class*/

    public void playMusic(){
        System.out.println("plying music...");
    }

}

class WangonR extends Car{ //concrete class

    /* as this is child class so if it is inheriting from a abstract class then it must declare all the
    undeclared methods of the abstract class, and if we didn't declare all the abstracts method here then 
    this class WagonR should also be made a abstract class and abstract keyword should be added in this class also */

    public void drive(){
        System.out.println("driving...");
    }
}




public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new WangonR();
        /* in above line as Car is a abstract class we cannot create object with it and that's why we created object using WagonR
        but abstract class can be used as a refrence type */
        obj.drive();
        obj.playMusic();
    }
}
