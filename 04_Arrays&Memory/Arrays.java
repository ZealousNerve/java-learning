public class Arrays {
    public static void main(String[] args) {
        int i;
        int arr[] = {3,7,2,4};
        System.out.println(arr[3]);
        System.out.printf("\n");
        arr[2] = 6;
        

        //to print all the values
        for(i=0;i<=3;i++){
            System.out.println(arr[i]);
            
        }
        


        //2D array
        int nums[][] = new int[3][4];

        //here below we are using for loop to fill random values in the array using a math function in java which gives random number
        //-less than 1 and hence we have multiplied with 100 to give a "two digit integer
        for(i=0; i<=2; i++){
            for(int j=0;j<=3;j++){
                nums[i][j] = (int)(Math.random()* 100); 
                //as math give random double value and hence we are type casting to convert it into int and then storing in the array
            }
        }

        for(i=0; i<=2; i++){
            for(int j=0;j<=3;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

System.out.println();

        //enhanced version of for loop which is used to print the array elements
        for(int n[] : nums){ //an array is taken from nums at a time and stored it into a different array n

            //For each loop:-
            //    this loop just iterates betweeen the differents elemets inside array

            for(int m: n){ //an element m is taken from an array n
                //it means take one value at a time from array n and store it into m
                System.out.print(m + " ");
            }
            System.out.println();
        }




        //Jagged Array
        int num[][] = new int[3][];
        num[0]= new int[3];
        num[1] = new int[4];
        num[2] = new int[2];
        // each arrar inside the array now are of different sizes


        // Drawbacks of arrays

        //--we cannot an array after it is defined




    }
}
