package BasicJava;

import java.util.List;
import java.util.NoSuchElementException;

public class Pract61_SecondHighest {

    public static void main(String[] args) {

        List<Integer> list = List.of(10, 39, 0, 77 ,10, 59, 18, 77, 5, 3);
        List<Integer> list1 = List.of(10);

        int SecHigh = list.stream().distinct().sorted((a, b) -> b-a).skip(1).findFirst()
                .orElseThrow(() -> new NoSuchElementException("No second number"));

        int highFive = list.stream().skip(4).findFirst().orElseThrow(() -> new NoSuchElementException("No element"));

        List<Integer> sortedList = list.stream().sorted((a, b) -> b - a).toList();

        System.out.println(SecHigh);
        System.out.println(sortedList);
        System.out.println(highFive);

    }
}
