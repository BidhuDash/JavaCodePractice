package BasicJava;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Pract55 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"bidhu");
        map.put(0,"Mr");
        map.put(4,"dash");
        System.out.println(map);

        map.putIfAbsent(3,"bhusan");
        //System.out.println(map);
        map.forEach((key,value)->{
            System.out.println(key+"="+value);
        });
        System.out.println("printing the map in descending order");
        //using stream to fetch the output in reverseOrder()
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(System.out::println);


        HashMap<Integer,String> hashMap = new HashMap<>(map);
        hashMap.putIfAbsent(3,"Don");
        hashMap.put(3,"done");

        System.out.println(hashMap);

        //hashMap.forEach(System.out::println());
    }
}
