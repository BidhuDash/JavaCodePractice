package TopJavaCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1, 3, 4, 5, "one", "two");

        //list.stream()
        list.stream().filter(i -> i.getClass() == Integer.class)
                .filter(i -> {
                    System.out.println(Math.sqrt((Integer) i));
                    return false;
                }).toList();


       /* String name = "Bidhu";
        System.out.println(name.getClass());*/
    }
}
