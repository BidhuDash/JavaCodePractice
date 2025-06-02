package TopJavaCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Bidhu Dash
 * @Date 02-06-2025
 * Company -- Provenier
 * <p>
 * PS: - Given a list of integers where like [1,2,3,4,5,6,7,8,9,10] preferable in an unordered way.
 * I need to sort that into odd numbers first then even numbers [odd + even] in a single list.
 */
public class Test1234 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 4, 10, 8, 9, 7);
//        List<Integer> odd = list.stream().filter(x->x % 2 !=0).toList();
//        List<Integer> even = list.stream().filter(x->x % 2 ==0).toList();

//        List<Integer> finalList = Stream.concat(odd.stream().sorted(),even.stream().sorted()).toList();

        List<Integer> finalList = list.stream()
                .sorted(Comparator.comparingInt((Integer x) -> x % 2 == 0 ? 1 : 0).thenComparingInt(x -> x))
                .toList();
        System.out.println(finalList);

    }

}
