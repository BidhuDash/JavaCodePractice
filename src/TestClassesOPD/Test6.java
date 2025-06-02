package TestClassesOPD;

import java.util.*;

/**
 * @Author Bidhu Dash
 * @Date 14-05-2025
 */
public class Test6 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,22,5,7,28,2,31,19,13,52,62);

        //This way we can find the second-highest number.
        Optional<Integer> SecondHigest = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        //System.out.println(SecondHigest.orElse(-1));

        int[] a = {1,12,4,55,21,87,10,44};
        int[] b = {35,5,76,22,12,44,4};

        Arrays.sort(a);
        int[] c = new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);

        System.out.println(Arrays.toString(c));

    
    }
}
