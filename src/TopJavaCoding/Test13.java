package TopJavaCoding;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test13 {
    public static void main(String[] args) {
        String a = "aaabbc";
        String b ="a3b2c1";
        String[] aa = a.trim().split("");
        List<String> list = List.of(aa);

        Map<String,Integer> map = list.stream().collect(Collectors.toMap(Function.identity(),x->1,Integer::sum));
        map.forEach((x,y)->{
            System.out.print(x+y);
        });
    }
}
