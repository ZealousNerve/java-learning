public class Loops {
    public static void main(String args[]){

    /* 
        int i = 1;

       //While Loop
       while(i<=4){
        System.out.println("hi " + i);
        int j= 1;
            while(j<=3){
                System.out.println("hello " + j);
                j++;
            }
        i++;
       }
    */

    /*    
        //Do While Loop
        int i = 5;

            do{
                System.out.println("Hi" + i);
                i++;
            }while(i<=4);
            //in do while the code will run once even when the condition fails
            //as when i = 5 the while loop should not work but in do while it will work once with i =5
    */  
    

        //For Loop

        for(int i=1; i<=4; i++){
            System.out.println("HI " + (i+8));
            //if we wouldn't put a bracket here in i + 8 it will assume it as a string because we are combinig string as well
        }
     //nested can also be applied


        
    }
}
