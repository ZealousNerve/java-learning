class Calculator2{
    public int add(int n1, int n2, int n3){
        //asks for three parametres
        return n1+n2+n3;
        //or we can store the sum in a variable and return that variable
    }

    public int add(int n1, int n2){
        //asks for two parametres
        return n1+n2;
    }

    public double add(double n1, int n2){
        //when we have both double and int we return with double
        return n1 + n2;
    }

    //both the methods are with the same name the only thing which change is the parameters
    //if we make no. or type of parameters in both the same then it will show an error that there are two identical parametres

    //and this operation is known as method overloading
}




public class MethodOverloadingInJava {
    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
