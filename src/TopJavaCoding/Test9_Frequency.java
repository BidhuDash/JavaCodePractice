package TopJavaCoding;

import java.util.*;
import java.util.stream.Collectors;

public class Test9_Frequency {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(100,100,5,-2,-7,7,-3,5,4,6,7);

        //Map<Integer,Integer> map =list.stream().collect(Collectors.toMap(Collections.frequency(Collections.,x->1,Integer::sum)));

        Map<Integer,Long> map =list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        map.forEach((a,b)->{
            System.out.println("elements="+a+ ":frequency="+b);
        });

    }
}
