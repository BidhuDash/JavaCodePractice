package BasicJava;

import java.util.*;

public class Pract63_MapSorting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ronaldo", 150);
        map.put("Messi", 148);
        map.put("Neymar", 89);
        map.put("Sunil", 77);
        map.put("Bidhu", null);
        // map.put(null, 17);


        List<Map.Entry<String, Integer>> lst1 = new ArrayList<>(map.entrySet());
        List<Map.Entry<String, Integer>> lst2 = new ArrayList<>(map.entrySet());

        lst1.sort((a, b) -> {
            Integer v1 = a.getValue();
            Integer v2 = b.getValue();

            if (v1 == null && v2 == null) return 0;
            if (v1 == null) return 1;
            if (v2 == null) return -1;

            return v1.compareTo(v2);
        });

        lst2.sort(Map.Entry.comparingByKey());

        Map<String, Integer> sortedMapByValue = new LinkedHashMap<>();
        Map<String, Integer> sortedMapByKey = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : lst1) {
            sortedMapByValue.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : lst2) {
            sortedMapByKey.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : sortedMapByKey.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("-------------------------");
        for (Map.Entry<String, Integer> entry : sortedMapByValue.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
