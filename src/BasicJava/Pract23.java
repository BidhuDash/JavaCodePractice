package BasicJava;

import java.util.Scanner;

//program to print the highest occurring character in the given string.
public class Pract23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word = word1.toLowerCase();
        int max = 0;
        char result = 'a';
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) ('a' + i);
            }
        }
        System.out.println(result);
    }
}
