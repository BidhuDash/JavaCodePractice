package DSA_CODES;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EX1 {

    public static void main(String[] args) {
        String a = "Biidhu";
        String[] aa = a.toLowerCase().trim().split("");
        List<String> list = Arrays.asList(aa);
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        map.forEach((x, y) -> {
            System.out.print(x + y);
        });

        System.out.println(map);


//        List<Integer> num= Arrays.asList(1,4,2,5,7,6,8,9);
//        Integer key =10;
//
//        Map<Integer,Integer> SumOfTwoNums = num.stream().filter((x,y)-> x+y == key).collect(Collectors.toMap(Function.identity(),Collectors.counting()));
    }
}
