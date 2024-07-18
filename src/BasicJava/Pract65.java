package BasicJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @Author Bidhu Dash
 * @Date 11-07-2024
 *
 *      Stream APIs
 */
public class Pract65 {
    public static void main(String[] args) {

        List<String> names = List.of("Bidhu","Ragu","Sunita","Roy","Ricky","Robin","Daisy","Deo","Easter");

        // predicate function filtering for names starting with the given letters
        names.stream().filter(x->x.startsWith("B")).forEach(System.out::println);

        System.out.println("-!_!_!_!_!_!_!_!_!_!_!_-");

        // maping tolist the length of names
        List<Integer> namesLength = names.stream().map(String::length).toList();
        System.out.println(namesLength);


        // using function functional interface while using flatMap() Operator
        List<List<String>> nestedLists= Arrays.asList(List.of("Bhusan","Dash"), names);
        List<String> flatenMap = nestedLists.stream().flatMap(Collection::stream).toList();
        System.out.println(flatenMap);

        List<String> distinctElements = names.stream().distinct().toList();
        System.out.println(distinctElements);

        List<String> sortedName = names.stream().sorted().toList();
        System.out.println(sortedName);

        List<Integer> lengthOfNamesSorted= names.stream().sorted().map(String::length).toList();
        System.out.println(lengthOfNamesSorted);

        System.out.println(names.stream().peek(System.out::println).toList());


    }
}
