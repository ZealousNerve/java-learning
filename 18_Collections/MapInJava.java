import java.util.HashMap;
import java.util.Map;

public class MapInJava {
   public static void main(String[] args) {
    //Map is a collection of KEY and Value pair, map is a collection of list and set

    Map<String, Integer> students = new HashMap<>(); 
    //Map<K, V> where k is the datatype of key and v is the datatype of values
    //in our case in place of k we have String and in place of V we have Integers
    //we can use HashTable instead of HashMap, if we want synchronized data

    //in Map we have put method as a replacement of add method

    students.put("Navin", 56);
    students.put("Harsh", 23);
    students.put("Sushil", 67);
    students.put("Kiran", 92);
    students.put("Harsh", 45); //duplicates key are not possible, duplicate values are possible
    //so the later key of Harsh is taken into the final Map, or we can say the value for the Key Harsh is updated

    System.out.println(students);
    System.out.println(students.get("Harsh")); //if we want to print individual value

    //to print only the set
    System.out.println(students.keySet());



    for(String key : students.keySet()){
        System.out.println(key + " : " + students.get(key));
    }


   } 
}
