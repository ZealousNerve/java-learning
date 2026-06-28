import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;


public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6); //another type to add value


        // below are three ways to print each element of the List

        for(int i=0; i<nums.size(); i++){           //01
            System.out.println(nums.get(i));
        }

        for(int n : nums){                          //02
            System.out.println(n);
        }

        nums.forEach(n -> System.out.println(n));   //03



        //-----------------------------------------------------------------
        // working of a forEach is given below

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };

        nums.forEach(con);
        //forEach take one element at a time and send it to Consumer con, inside con a method prints the value

        /* consumer interface is functional interface so we can use lambda expression here and after lmbda expression 
        we can get one expression as we seen when we first used forEach above */

        //-----------------------------------------------------------------




        /* ------------------------------------------------------
        
        a example of a normal operation done on list
        
        int sum=0;
        for(int n: nums){
            if(n%2==0){
                n *= 2;
                sum += n;
            }
        } 

        System.out.println(sum);

        ---------------------------------------------------------------*/

        



        
    }
}
