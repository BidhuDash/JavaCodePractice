package TopJavaCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Test18 {
    public static void main(String[] args) {

        int k =5;
        List<Integer> list = new ArrayList<>(List.of(3, 2, 18, 5, 6, 4, 11, 19, 15, 23, 50));

        Collections.sort(list);
        System.out.println(list);

        int thirdLargest = list.stream().sorted((a,b)->b-a).skip(k-1).findFirst()
                .orElseThrow(()-> new NoSuchElementException("No Such element"));

        System.out.println(thirdLargest);
    }
}
