// @Deprecated this annotation will tell everyone using this class that is is deprecated so it will work but not to use it
class A{
    public void ShowTheData(){
        System.out.println("in A show");
    }
}

class B extends A{

    // @Override
    public void ShowTHeData(){
        System.out.println("in B show");
    }
}



public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.ShowTheData();

        /* the thing which we are trying to do is method overriding, we created a parent class with method show
        then created a method with same name in the child class, so definitly the output will be in favour of class B
        but in our case the output would be in favour of A. why?
        
        because if you can notice, in the method name in both classes there is one difference, a capital H
        and issues like this won't be visible during runtime and it will not even show any error
        
        and here we take help of annotations, using a annotation like @override just outside the method of class B
        we are telling the compiler that we are trying to override and if the method name would mismatch or any similar 
        logical error happens then annotation will reflect a warning
        
        uncomment the @override and see what happens*/
    }
}
