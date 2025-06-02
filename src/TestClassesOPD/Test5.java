package TestClassesOPD;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Bidhu Dash
 * @Date 13-05-2025
 * <p>
 *
 *  Given a list of strings where you have to arrange the words according to the count of vowels present in it.
 *  Let's say if two words have similar number of vowels, then their precedence will be according to the weightage of
 *  the vowels given like [a=10,e=20,i=30,o=40,u=50]
 *
 */
public class Test5 {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("asdrwr", "arwerwr", "gfgwet");
        words.sort(Comparator.comparingInt(Test5::countVowels).thenComparingInt(Test5::weightVowels));

        System.out.println(words);

    }

    static int countVowels(String a) {
        int count = 0;
        for (char ch : a.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) count++;
        }
        return count;
    }

    static int weightVowels(String b) {
        int weight = 0;
        for (char ch : b.toCharArray()){
            switch (ch){
                case'a': weight +=10; break;
                case'e': weight +=20; break;
                case'i': weight +=30; break;
                case'o': weight +=40; break;
                case'u': weight +=50; break;
            }
        }
        return weight;
    }
}
