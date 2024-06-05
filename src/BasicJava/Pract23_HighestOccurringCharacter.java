package BasicJava;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

//program to print the highest occurring character in the given string.
public class Pract23_HighestOccurringCharacter {
    public static void main(String[] args) {

        System.out.println(maxOccurringChar("BisterNestaulliulliCostaCullynioampellte"));


        String word = "BisterNestaulliulliCostaCullynioampellte ";
        maxOccurringChar2(word);
    }

    public static char maxOccurringChar(String word) {
      String str=  word.toLowerCase();
        char ans = 'a';
        int maxfreq = 0, n = str.length();
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
            if (count[str.charAt(i)] > maxfreq) {
                maxfreq = count[str.charAt(i)];
                ans = str.charAt(i);
            }
        }
        return ans;
    }

    public static void maxOccurringChar2(String wo){
        String word = wo.toLowerCase();

        //step =1 create a frequency map using stream api.
        Map<Character,Long> maxChar = word.chars().filter(ch-> !Character.isWhitespace(ch)).mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //step = 2 find the max frequency with stream api.
        long maxFrequency = maxChar.values().stream().max(Long::compare).orElse(0L);

        //step =3 find the characters with the highest frequency
        maxChar.entrySet().stream().filter(x->x.getValue()==maxFrequency)
                .forEach(a-> System.out.println("  Character ("+a.getKey()+") occurs "+ maxFrequency+" times"));
    }
}
