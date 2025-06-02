package BasicJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @Author Bidhu Dash
 * @Date 26-05-2025
 *
 *      List.of(); ----- immutable, thread-safe, non-null, less overhead
 *      Arrays.asList(); -------- mutable, not inherently thread-safe, allows null, overhead
 */
public class Pract70 {
    public static void main(String[] args) {

        //List<Integer> list  = new ArrayList<>(List.of(12,3,43,67,54,15,95));
        List<Integer> list  = Arrays.asList(12,3,43,67,54,15,95);

        int secondLargest = list.stream().sorted((x,y)-> y-x).distinct().skip(1).findFirst().orElseThrow(()-> new NoSuchElementException("Not Found"));
        Collections.sort(list);
        System.out.println(secondLargest);
        System.out.println(list);
    }
}
