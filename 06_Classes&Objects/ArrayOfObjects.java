class Student{

    int rollno;
    String name;
    int marks;
}


public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student(); //the student() at the end is called as constructor
        s1.rollno =1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno=2;
        s2.name= "Rahul";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollno=3;
        s3.name= "Shruti";
        s3.marks = 85;

        Student students[] = new Student[3]; //here we are creating a array which stores the data of object
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0; i < students.length; i++){
            System.out.println(students[i].name + " " + students[i].marks);
        }

    /* 
        int nums[] = new int[6];
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;
        //by default each unassinged value of array is zero
        
        //arrays have a property length

        for(int i=0; i<nums.length; i++){
            //istead of writing the number 6 we just use length to calculate by its own
            System.out.println(nums[i]);
        }
*/

    }
    
}
