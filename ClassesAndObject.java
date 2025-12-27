class Calculator{
    //class can have variables
    int a; 

    //below, public shows the access that the method can be called from anywhere, int shows the datatypes in
    //in which the method is going to return the value when called, and the name of the method is "add"
    public int add(int n1, int n2){
        System.out.println("in add");
        int r = n1 + n2;
        return r;
    }
}





public class ClassesAndObject {
    //Object oriented programming
    //every object have two properties it knows something and it does something

    public static void main(String args[]){

        int num1 = 4;
        int num2 = 5;

        //creating an object

        //below Calculator is like a datatypes and calc is variable name
        Calculator calc = new Calculator(); //calc with the property of Calculator class, new object
        int result = calc.add(num1,num2); // . is used to call a method (Properties of add method is given to calc object)
        System.out.println(result);

    }
}

//First we have to create a class
//then we have to create method with properties
//then create an object based on the property of that method
//then use the object