package TopJavaCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*  arr[] = {2,1,2,3,4,4,
*
*
*
* */


public class Test11 {
     static public void main(String[] args) {

        Integer[] aa = new Integer[]{5, 7, 9, 9, 7, 5};
        List<Integer> list = List.of(aa);

        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(Function.identity(), x -> 1, Math::addExact));
        map.forEach((x, y) -> System.out.println(x + "," + y));

        //int max =
        System.out.println(Collections.max(map.values()));
    



    }
}
