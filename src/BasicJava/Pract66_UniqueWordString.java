package BasicJava;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author Bidhu Dash
 * @Date 11-07-2024
 *
 *
 */
public class Pract66_UniqueWordString {

    public static void main(String[] args) {
        List<String> sentence = Arrays.asList(

                "Hello", "Bidhu", "what", "Bidhu", "are",
                "You", "doing", "doing", "here", "say"
        );

        Set<String> uniqueWord = sentence.stream()
                .flatMap(a -> Arrays.stream(a.split(" "))).collect(Collectors.toSet());

        System.out.println(uniqueWord);
    }
}
