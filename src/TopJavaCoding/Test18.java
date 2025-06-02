package TopJavaCoding;

import java.util.*;
/**
 * @Author Bidhu Dash
 * @Date 16-05-2025
 *
 * Basically, this finds the kth index element in the provided list.
 */
public class Test18 {
    public static void main(String[] args) {

        int k = 6;
        List<Integer> list = new ArrayList<>(List.of(3, 2, 18, 5, 6, 4, 11, 19, 15, 23, 50));

        //Collections.sort(list);
        //list.sort(Comparator.reverseOrder());


        System.out.println(list);

        int thirdLargest = list.stream().sorted((a, b) -> b - a).skip(k - 1).findFirst()
                .orElseThrow(() -> new NoSuchElementException("No Such element"));

        System.out.println(thirdLargest);
    }
}
