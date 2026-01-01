class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1+n2+1;
    }

    /* in method oveloading the method name was same and the parameters were different but in method overriding the
    name and parameters both will be same, if we comment out the add method in advcalc then it will add using parent class
    output would be 7, and after uncommenting there is the same method add but it overrides the add method of parent class 
    
    
    
    it simply means i want to inherit all the properties(methods) form my parents except one properties(method) which is defined by me
    in my own class


    and this phenomena is know as method overriding
    */
}


public class MethodOverriding{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 3);
        System.out.println(r1);
    }
}