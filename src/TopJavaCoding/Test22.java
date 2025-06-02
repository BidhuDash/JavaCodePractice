package TopJavaCoding;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @Author Bidhu Dash
 * @Date 16-05-2025
 */
public class Test22 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 6, 3, 2, 5, 5, 4, 8, 9);

        // provides a distinct list of elements.
        List<Integer> distinctList = list.stream().distinct().toList();
        System.out.println(distinctList);

        // provides the max & min elements from the list of Integers.
        Optional<Integer> maxElement = distinctList.stream().max(Integer::compareTo);
        Optional<Integer> minElement = distinctList.stream().min(Integer::compareTo);
        System.out.println("maxNumber is :" + maxElement.orElse(-1));
        System.out.println("minNumber is :" + minElement.orElse(-1));

        //List<Integer> duplicatesList = list.stream();

        //List<Integer> sortedList = list.stream().sorted(Comparator.naturalOrder()).toList();
        List<Integer> sortedList = Collections.singletonList(list.stream().sorted((a, b) -> b - a)
                .distinct().skip(1).findFirst().orElse(-1));
        System.out.println(sortedList);
    }
}
