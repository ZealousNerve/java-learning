import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;


public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Stream<Integer> s1 = nums.stream();
        /* now s1 contains everything that was inside nums, and now we can perform multiple operations on it
        using predefined metods, now whatever operation we performed on s1 will be for s1 only the actual data will not be 
        disturbed */

        /* once we have used the stream then we can't use it again and that's why we are creating new stream dependent on previos stream
        to perform a set of action on the data */

        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n+2);
        int result = s3.reduce(0, (c, e) -> c+e);
        //after reduce it will return only one value not a stream and it will be stored inside the result
        
       System.out.println(result);

        // we can do all that in one block as given below
        int result1 = nums.stream()
                            .filter(n -> n%2==0)
                            .map(n -> n*2)
                            .reduce(0, (c,e) -> c+e);

        System.out.println(result1);


        /* here below, instead of nums.stream() we can use nums.parallelStream() to apply multiple threads and make our work faster
        but don't use parallelStream with sorted. */
        
        Stream<Integer> sortedValues = nums.stream()
                                            .filter(n -> n%2==0)
                                            .sorted();

                                    
        sortedValues.forEach(n -> System.out.println(n));
        //this will print the sorted stream with the filter applied

        
    }
}
