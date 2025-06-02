package BasicJava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author Bidhu Dash
 * @Date 21-05-2025
 */
public class Pract71 {
    public static void main(String[] args) {

        String a = "dfwwrasgsgwerwrasvxb";
        List<Character> Duplicates = a.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();

        System.out.println(Duplicates);

        List<String> list = Arrays.asList("bidhu","hi","bye","Good","bye","Great","hi");
        Map<String,Long> finalList = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        finalList.forEach((x,y)-> System.out.println(x+","+y));
    }
}
