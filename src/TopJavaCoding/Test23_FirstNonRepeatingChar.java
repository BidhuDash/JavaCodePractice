package TopJavaCoding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * @Author Bidhu Dash
 * @Date 20-05-2025
 *
 *
 */
public class Test23_FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "Programming";

        Optional<Character> firstNonRepChar = str.chars().mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue() == 1).map(Map.Entry::getKey).findFirst();

        System.out.println(firstNonRepChar);

        String revString = new StringBuilder(str).reverse().toString();
        System.out.println(revString);


    }




}
