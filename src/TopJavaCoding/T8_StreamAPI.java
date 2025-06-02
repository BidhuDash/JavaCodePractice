package TopJavaCoding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class T8_StreamAPI {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(ls.stream().filter(i -> i % 2 == 0).toList());


        // to find the duplicate elements from the list of integers using Set data structure.
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 2, 4, 5, 4, 6, 8, 9, 6);
        Set<Integer> set = list.stream().filter(x -> Collections.frequency(list, x) > 1).collect(Collectors.toSet());
        set.forEach(System.out::println);


        String a = "bidasdrdheeakekrte";
        String[] aa = a.trim().split("");
        for (String s : aa) {
            System.out.print(s + " ");
        }
        System.out.println("\n" + aa[4]);

        List<String> str2 = List.of(aa);
        Map<String, Integer> map = str2.stream().collect(Collectors.toMap(Function.identity(), x -> 1, Math::addExact));
        map.forEach((x, y) -> {
            System.out.println("Character:-" + x + " Occurrence:-" + y);
        });

        Map<Integer, Integer> map2 = ls.stream().collect(Collectors.toMap(Function.identity(), x -> 1, Integer::sum));
        map2.forEach((x, y) -> {
            System.out.println("Character:-" + x + " Occurrence:-" + y);
        });

        //List<String> str3 = str2.stream().filter(x->Collections.frequency(str2,x)>2).toList();
        //System.out.println(str3);
        //set2.forEach(System.out::println);


        //Map<Integer,Emp> = list.stream().map((i,j)->i.Emp)
        //list.stream().filter(i->{i.getExp<5).map(i->i.getName()).collect(Collectors.toList());


        //List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6);

        //lst.stream().filter(i -> i / 2 == 0).collect(Collectors.toList());
    }
}

   /* @Override
    public int compareTo(Object o) {
        return this.compareTo();
    }
}*/


