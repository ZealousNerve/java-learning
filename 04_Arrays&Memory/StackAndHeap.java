class Calculator1{
        int num; // this is known as instance variable

        public int add(int n1, int n2){
            return n1 + n2; //this n1 and n2 are called local variables

        }
    }


public class StackAndHeap {
    
    public static void main(String[] args) {
        Calculator1 obj = new Calculator1();
        int r1 = obj.add(3,4);
        System.out.println(r1);
    }
    
}


//stack is last in first out
//every methods have its own stack
//stack will have an key(name of variable) and a value
//instance variable are part of heap memory
//there is a link between stack and heap and that due to the address
//objects are in heap 