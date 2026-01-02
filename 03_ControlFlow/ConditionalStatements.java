public class ConditionalStatements {
    public static void main(String[] args){
        int x = 8;
        int y = 7;
        int z = 9;

        if(x>y && x>z){ // if there are multiple statements then add curly brackets
            System.out.println(x);
        }
        else if(y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
    
}
