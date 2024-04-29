package TopJavaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {

        int[] a = {1,2,6,8,9,10,14,3,19,12};
        Arrays.sort(a);
        List<int[]> list = new ArrayList<>(List.of(a));
        Collections.reverse(list);
        list.forEach(System.out::println);


    }
}
