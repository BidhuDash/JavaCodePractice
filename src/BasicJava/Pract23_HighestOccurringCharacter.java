package BasicJava;

import java.util.Scanner;

//program to print the highest occurring character in the given string.
public class Pract23_HighestOccurringCharacter {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word = word1.toLowerCase();
        int max = 0;
        char result = 'a';
        int[] count = new int[256];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) ('a' + i);
            }
        }*/
       // System.out.println(result);

        System.out.println(maxOccurringChar("Sibbbsterrsr"));

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
}
