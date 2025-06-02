package TestClassesOPD;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/**
 * @Author Bidhu Dash
 * @Date 26-05-2025
 */
public class Test11 {

    public static void main(String[] args) {
        int[] aarr = {1, 2, 2, 3, 4, 5, 6, 90, 11, 23, 3, 87, 90, 54, 10,87};

        Optional<Integer> secondLargest = Arrays.stream(aarr).boxed().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst();
        System.out.println(secondLargest.orElse(-0));

    }
}
