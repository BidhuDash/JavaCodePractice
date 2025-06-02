package TopJavaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class T16_Frequency {

    // method to count the Integers Freq
    static void getIntegersFreq(List<Integer> list) {
//        Map<Integer,Integer> map =list.stream().collect(Collectors.toMap(Collections.frequency(Collections.,x->1,Integer::sum)));
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((a, b) -> {
            System.out.println("elements=" + a + ":frequency=" + b);
        });
    }

    static void getCharactersFreq(String str) {
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((a, b) -> {
            System.out.println("elements=" + a + ":frequency=" + b);
        });
    }

    public static void main(String[] args) {
        //list of unarranged integers
        var intList = Arrays.asList(100, 100, 5, -2, -7, 7, -3, 5, 4, 6, 7);
        getIntegersFreq(intList);

        System.out.println("-------------------------------");

        // Count the character frequency in the given String
        String str= "fafsjfajfhjhuwherw";
        getCharactersFreq(str);




    }
}
