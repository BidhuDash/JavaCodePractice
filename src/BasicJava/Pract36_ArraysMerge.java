package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * @Author Bidhu Dash
 * @Date 27/05/25
 *
 *      Merge two int[] arrays using
 *      a) System.arrayCopy();
 *      b) Stream API -- IntStream.concat().toArray;
 */
public class Pract36_ArraysMerge {
    public static void main(String[] args) {

        int[] a = {1,25,1,23,64,1,76,2};
        int[] b = {43,2,1,65,2,65,33};

        int[] d = new int[a.length + b.length];
        // (a) -- using System.arraycopy();
        System.arraycopy(a,0,d,0,a.length);
        System.arraycopy(b,0,d,a.length,b.length);

        System.out.println(Arrays.toString(d));

        // (b)  -- using IntStream.concat().toArrays
        int[] c = IntStream.concat(Arrays.stream(a).sorted().distinct(),Arrays.stream(b).sorted().distinct()).toArray();
        System.out.println(Arrays.toString(c));

        // (c) --  merging 2 lists using Stream().concat(list1,list2).collect(Collectors.toList());
        List<String> list1 = new ArrayList<>();
        list1.add("Hi");
        list1.add("Bye");
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(87);
        List<Object> finalList = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        System.out.println(finalList);
    }
}
