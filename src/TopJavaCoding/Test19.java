package TopJavaCoding;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test19 {
    public static void main(String[] args) {

        String a = "aaaabbbbcccddddd";
        //char[] aa = a.toCharArray();
        String[] aa = a.trim().split("");

        //List<Character> list = a.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
        List<String> list = List.of(aa);

        Map<String, Integer> map = list.stream().collect(Collectors.toMap(Function.identity(),x->1,Integer::sum));
        map.forEach((x,y) -> {
            System.out.print(x+y);
        });

    }
}
