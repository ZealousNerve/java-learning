class Student {
    int marks;
}

//java is only call by value
//this is a case which replicates call by refrence in java but still it is called as call by value because value is sended


/* if we don't care about adavance oops topic then in java and c comparison struct(c) is like class(java) and function(c) are like methods(java) */



public class CallByValueDemo {

    // Method that receives a Student object
    static void update(Student s) { //here in paranthesis s is variable name whereas Student is the data type ex. similar to the argument int n
        
        // modifying the object's data
        s.marks = 90;
    }

    public static void main(String[] args) {

        // Creating object of Student
        Student obj = new Student();
        obj.marks = 50;

        System.out.println("Before update: " + obj.marks); //50

        // Passing object to method
        update(obj);

        System.out.println("After update: " + obj.marks); //90
    }
}
