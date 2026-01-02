interface A{
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X, A{
    //a class can extend to one class
    //a class can implement multiple interfaces
    //a interface can extends to multiple interfaces
}

class B implements Y, X, A{ //here we don't need to write x and A as we have written Y and Y extends to both X and A
    //a class can implement multiple interfaces
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }

    public void run(){
        System.out.println("running...");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Y obj = new B();  //y contains show, config, run
        A obj1 = new B(); //A contains show, config
        X obj2 = new B(); //X contains run only

        //obj created with Y as refrence can call methods of A and X both
        obj.show();
        obj.config();
        obj.run();

        //obj created with A as refrence can call methods on A only
        obj1.show();
        obj1.config();

        //obj created with X as refrence can call methods of X only
        obj2.run();
    }
}
