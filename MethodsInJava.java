class computer{
   
    public void playMusic(){
    //void returns nothing
    System.out.println("Music Playing");
    }


    public String getMeAPen(int cost){
        if(cost >= 10)
            return "Pen";
            //after return it will jump out of the method it will not goes till else if if is true
        else    
            return "Nothing";

            //return just goes back after returning the value
    }


}


//the difference between the main and getmeapen method is the static keyword which we are gonna learn later


public class MethodsInJava {
    public static void main(String[] args) {
        //in a car different components are required and similarly in program different required components are called class
        //

        computer obj = new computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);
    }
    
}
