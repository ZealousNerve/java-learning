public class SwitchStatement {
    public static void main(String[] args){
        int n = 4;

    /*
        switch (n) {
            case 1, 8: //we can write two or more case separated by a comma
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Sunday");
                break;
            }  
            //if we wouldn't write break then all the condition
            // will run after the one condition get satisfied
        */

        switch (n) { //no need to use break
            case 1, 8 -> System.out.println("Monday");
                
            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            case 4 -> System.out.println("Thursday");
                
            case 5 -> System.out.println("Friday");
                
            case 6 -> System.out.println("Saturday");
                
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
