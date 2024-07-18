package BasicJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pract56_IntegerDistinct {

    public static void main(String[] args) {
        String[] a = {"b", "i", "i", "d", "d", "h", "u"};
        String b = "Bidhu";
        char[] bb = b.toCharArray();

        //1.1 to check the distinct elements in a primitive type array
        int[] c = new int[]{1, 2, 2, 4, 6, 6, 7};
        List<int[]> list = List.of(c);  // by this method also we can add int[] to list
        List<int[]> newlist = list.stream().distinct().toList();
        for (int[] i : newlist) {
            System.out.println(Arrays.toString(i));
        }


        //1.2 to check the distinct elements in the given array
        Integer[] intarr = new Integer[]{1, 2, 2, 4, 6, 6, 7};
        for (Integer i : intarr) {
            System.out.print((i + " "));
        }
        System.out.println();
        List<Integer> integerList = Arrays.asList(intarr);
        System.out.println("distinct " + integerList.stream().distinct().toList());


        //1.3 to check the distinct elements in given string
        List<String> lst = Arrays.asList(a);
        //Collections.addAll(lst, a); // by this method we can add string of array to list
        System.out.println(lst);
        // this method will give a stream of all distinct value provided in a string[]
        System.out.println(lst.stream().distinct().toList());

        String lastestString = lst.stream().distinct().collect(Collectors.joining());
        System.out.println(lastestString);
    }
}
