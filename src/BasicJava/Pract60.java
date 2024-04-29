package BasicJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pract60 {
    
    public static void main(String[] args) {

        // array ---> List
        Integer[] arr1 = new Integer[]{1,2,6,23,54};
        List<Integer> arrayList = Arrays.asList(arr1);

        List<Integer> list = List.of(1,5,8,7,9,7,5,1,3,4,5,2,7);

      //  List<String> StrList = List.of("This","SI","UR","ANME");

//       List<String> mainlist = StrList.stream().sorted(String::compareTo).toList();
//       System.out.println(mainlist);

        Map<Integer,Long> total = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        total.forEach((a,b)->System.out.println(a+":"+b));
    }
}
