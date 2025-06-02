import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author Bidhu Dash
 * @Date 02-06-2025
 */
public class Demo {
    public static void main(String[] args) {
        String str = "safaewrwag";

        // find occurances of each character

        Map<Character, Long> occ = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //char frq = occ.values().stream().max(Integer::compare).toString();


        occ.forEach((x,y)-> System.out.println(x+","+y));
    }
}