public class LogicalOperators {
    public static void main(String args[]){
        // & (AND), | (OR), ! (NOT)
        // &&, ||, ! - short circuit
        
        // in short circuit, if the first command satisfies it 

        /* In both C and Java, && is logical AND and & is bitwise AND; however, 
        Java allows & to also operate on boolean values without short-circuiting. */
        
        // wouldn't even check the second command

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a > b; // if the first one is 
        // false it wouldn't even check the second case

        // we can use multiple && between as many conditions as we want
        System.out.println(result);
        System.out.println(!result); //here ! is used to print opposite of the value of result
    }
    
}
