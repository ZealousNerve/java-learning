public class SwitchStatement {
    public static void main(String args[]){
        int n = 4;

    /*
        switch (n) {
            case 1, 8: //we can write two or more case seprated by a comma
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
            default:
                System.out.println("Sunday");
                break;
            }  
            //if we wouldn't write break then all the condition
            // will run after the one condition get satisfied
        */

        switch (n) { //no need to use break
            case 1, 8 -> System.out.println("monday");
                
            case 2 -> System.out.println("tuesday");

            case 3 -> System.out.println("wednesday");

            case 4 -> System.out.println("thursday");
                
            case 5 -> System.out.println("friday");
                
            case 6 -> System.out.println("saturday");
                
            default-> System.out.println("Sunday");
            //either use colon after case condition or use arrow
            // any one of that should be used everywhere in a switch case
            }

            String day ="Wed";
            String result;

            result = switch(day)
            {
                case "Saturday", "Sunday" : yield "6 am";//colon with yield is used in place of arrow
                default : yield "fuck";
            
            }; //here a semicolon is used
            System.out.println(result);
        
    }
}
