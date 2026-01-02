@FunctionalInterface //annotation to ensure that below given interface is SAM or not
interface A{ //SAM
    void show();
}


public class Functionalinterface{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in A show");
            }
        };
        obj.show();
    }
}
