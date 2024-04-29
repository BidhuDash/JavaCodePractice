package DSA_CODES;

import java.util.*;
import java.util.stream.Collectors;

public class EX1 {

    public static void main(String[] args) {
        String a = "Biidhu";
        String[] aa =a.trim().split("");
        List<String> list = Arrays.asList(aa);
        Map<String,Long> map =list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(map);
    }
}
