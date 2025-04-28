package DSA_CODES.Arrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author Bidhu Dash
 * @Date 18-07-2024
 * <p>
 * findDuplicates() gives an array of duplicate elements in the provided array.
 * findFrequency()  gives a map of elements with there occurrence
 */
public class A1 {

    public static void main(String[] args) {

        int[] B = {1, 2, 4, 5, 6, 7, 3, 4, 8, 3, 6, 8, 9, 4, 3};
       // Integer[] c = new Integer[]{34, 65, 11};
        findDuplicate(B);
        findFreq(B);

    }

    private static void findDuplicate(int[] b) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();
        for (int i : b) {
            if (!set.add(i))
                duplicateElements.add(i);
        }

        System.out.println("Duplicate array : " + duplicateElements);
        System.out.println("Distinct elements: " + set);

    }

    private static void findFreq(int[] b) {
        List<Integer> list = Arrays.stream(b).boxed().toList();
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        map.forEach((x, y) -> {
            System.out.println(x + "," + y);
        });
    }

}
