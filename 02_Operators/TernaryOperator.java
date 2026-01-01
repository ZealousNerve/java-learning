public class TernaryOperator {
    public static void main(String args[]){
    
        int n = 4;
        String result;
    /*
        if(n%2 == 0)
            result = "Even";
        else
            result = "Odd";

        
    */

    //Now the above code is written in a short form
    result = (n%2==0 ? "even": "odd");
    //now this ? and : is called as ternary operator
    System.out.println(result);
        
        




    }
}
