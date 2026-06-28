/* In Java, an enum (enumeration) is a special type of class used to represent a fixed set of constants.
enum can be used when there are certain predefined fixed constants, for example asssume days in week so a enum
class named days can contain monday, tuesday and so on, so there will be only one monday and no other values can be
accepted so no invalid data possible


enum is a class and each enum constants is an object, all enum constants are public, static and final

Enum constants are static final references to objects, but the fields inside the enum are instance variables, 
so each enum constant can hold different values.

enum with switch is very common

we can assign codes in enum objects like for our example status failed can have a code 404 we can assign code by the syntax
Failed(404){as Failed is a object so Failed(404) is a parametrized constructor} inside enum
*/


enum Status{
    Running, Failed, Pending, Success;
    /* all the constants are having a index starting from 0 
    Running = 0
    Failed = 1
    Pending = 2
    Success = 3
    we can use ordinal(i) to get the index of named constant */
}

public class EnumInJava {
    public static void main(String[] args) {
        Status s = Status.Running; 
        System.out.println(s); //it will print the named constant Running
        System.out.println(s.ordinal()); //as s contains Running this line will print 0

        //to get all status at once
        Status[] p = Status.values();
        //Status.values() gives an array

        //enhanced for loop to print array elements 
        for(Status q: p){
            System.out.println(q + " : " + q.ordinal());
        }
        

        //Switch Case
        Status k = Status.Running;

        switch(k){
            case Running:
                System.out.println("good job");
            break;

            case Failed:
                System.out.println("Try again");
            break;

            case Pending:
                System.out.println("please wait");
            break;

            default:
                System.out.println("Done");
                break;
        }
    }
}
