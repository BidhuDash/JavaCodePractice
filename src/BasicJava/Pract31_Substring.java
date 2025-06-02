package BasicJava;
//Print all possible substring of a given string

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pract31_Substring {
    public static void main(String[] args) {
        String a = "abccddeffg";
        //char[] b = a.toCharArray();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                // System.out.println(a.substring(i, j));  here you will get the substring
                list.add(a.substring(i, j));
            }
        }
        System.out.println(list);



    }
}
