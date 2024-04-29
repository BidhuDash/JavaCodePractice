package BasicJava;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pract57_StringFrequency {
    public static void main(String[] args) {
        String str = "bidhu dash dash";

        String[] aa = str.trim().split("");
        List<String> list = List.of(aa);

        Map<String,Integer> map = list.stream().collect(Collectors.toMap(Function.identity(),x->1,Math::addExact));
        map.forEach((x,y)->{
            System.out.println("Keys: "+x+",values: "+y);
        });
    }
}
