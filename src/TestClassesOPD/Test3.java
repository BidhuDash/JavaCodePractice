package TestClassesOPD;

import java.util.*;

/**
 * @Author Bidhu Dash
 * @Date 12-05-2025
 */
public class Test3 {

    // to find out the character frequency of the given string.
    static void getCharacterFreq(String name){
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            //System.out.print(map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }

    //to find the duplicate elements in a given array
    static Set<Integer> getDuplicateElements(Integer[] arr){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i : arr){
            if(!seen.add(i)) duplicates.add(i);
        }
        return duplicates;
    }

    static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new HashSet<>(list));
    }

    public static void main(String[] args) {

        // To find out the Character frequency in a string

        String str = "graterutiw";
        //getCharacterFreq(str);

        Integer[] a =  {1, 4, 2, 5, 6, 7, 8, 9, 1, 2, 5};
        System.out.println(getDuplicateElements(a));
        System.out.println(removeDuplicates(List.of(a)));
    }
}
