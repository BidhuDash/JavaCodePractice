package TopJavaCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test12 {
    public static boolean isPalindrome(String str) {
        int low = 0, high = str.length() - 1, flag = 0;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                flag = 1;
                break;
            }
            low++; high--;
        }
        return flag == 0;
    }

    public static void main(String[] args) {
        String a = "mom madam is coming";
        String[] aa = a.trim().split("\\s");
        List<String> list = new ArrayList<>();
        for (String i : aa) {
            if (isPalindrome(i)) {
                list.add(i);
            }
        }

        String largestPalindrome = list.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(largestPalindrome);
    }
}

//pruthvi@thoughtclan.com
