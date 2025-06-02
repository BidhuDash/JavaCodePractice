package TopJavaCoding;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Bidhu Dash
 * @Date
 *
 * PS: - Given a list of Objects, print out only integer class numbers using Stream API.
 *
 */

public class T6 {
    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1, 3, 4, 5, "one", "two",323L,'r',0.2f,false);

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
