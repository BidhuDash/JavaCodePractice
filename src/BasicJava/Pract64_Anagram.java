package BasicJava;

import java.util.Arrays;

public class Pract64_Anagram {
    public static void main(String[] args) {
        String a = "bra";
        String b = "bar";

        a = a.toLowerCase();
        b = b.toLowerCase();

        System.out.println(a + "\n" + b);

        if (a.length() != b.length()) System.out.println("Not an Anagram");

        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);

        if (Arrays.equals(aa, bb)) System.out.println("Anagram");
        else System.out.println("Not an Anagram");

    }
}
