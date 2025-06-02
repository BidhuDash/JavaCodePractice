package TopJavaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;



public class T10_Distinct {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 3, 3, 4, 5, 5, 6, 7, 8);

        // (a) Type 1 ---- using HashSet()
        System.out.println(new ArrayList<>(new HashSet<>(list1)));

        // (b) Type 2 ---- oneLiner
        System.out.println(list1.stream().sorted().distinct().toList());
    }

}




