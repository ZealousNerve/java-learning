import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

    
}

public class ComparatorVsComparable {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums); // to sort
        //above Collections class is used not Collection interface

        System.out.println(nums);

//-----------------------------------------------------------------------------------------------------------------------------------


        //what if we want to sort the numbers using our own logic

        /* here we have created a comparator to sort using our own logic, we know for sorting we take two values 
        from the start and compare them then move the sorter one on lhs and then take next two values again with same logic
        and after multiple iteration we will get a sorted one, in which every int is in ascending order
        
        and similarly here we create a anonymous inner class of the class Comparator, then we create a method inside it
        which take two elements at once then here comes our own sorting logic, and after our logic if we return 1 it will swap
        and if it is -1 it will not swap
        
        in this case we use the logic that sort the numbers using swap logic, but based on the last digit of the number 
        if lasst digit of first number is greater than the last digit of scond number then swap otherwise don't swap*/

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;

            }
        };

        Collections.sort(nums, com);
        //com is the comparator which we defined above and it defines our logic
        System.out.println(nums);

//---------------------------------------------------------------------------------------------------------------------------------


        //what if instead of integer we want our own data like data of students

        /* first we will create a class Student then we add to instance variable in it i.e. name and age
        then we will add one constructor to take inputs in our class, and one overriding method toString
        then we will create objects with the class Students as show above */

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(22, "navin"));
        studs.add(new Student(12, "jhon"));
        studs.add(new Student(18, "parul"));
        studs.add(new Student(20, "kiran"));

        Comparator<Student> com1 = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age > j.age)
                    return 1;
                else
                    return -1;

            }
        };

        Collections.sort(studs, com1);


        System.out.println(studs); // to print all at once


        //enhanced for loop to  print one student at a time
        for(Student s: studs){
            System.out.println(s);
        }

//---------------------------------------------------------------------------------------------------------------------------------

        /* as we know we can just use Collection.sort(nums) to sort with default logic on its own without using a comparator
        thats because the Integer class implements Comparable which has a method name compareTo and inside compareTo we are adding the same logic 
        which we used in comparator of students, uncomment the part that says "implements Comparable<Student>" in the student class, 
        also uncomment the method "compareTo()" inside the same class */

        
        System.out.println(studs); // now just writing this will sort it no need for comparator

        //Comparator is a functional interface so we can use lambda expression here


    }
}
