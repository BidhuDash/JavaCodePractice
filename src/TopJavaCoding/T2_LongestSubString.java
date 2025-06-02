package TopJavaCoding;

import java.util.HashMap;
import java.util.Map;

/*Find the length of the longest substring without repeating the characters */
public class T2_LongestSubString {
    public static void main(String[] args) {
        String a = "absbdhedyest";
        String str = "thelongestsubstring";
        System.out.println(longestSubstringLength(str));
        System.out.println(longestSubString(str));
    }

    /* time complexity = O(N) where N is the length of the string
       space complexity = O(min(N,M)) where M is the length of the substring */
    public static int longestSubstringLength(String a) {
        int[] ch = new int[128];
        int left = 0, right = 0, result = 0;

        while (right < a.length()) {
            char r = a.charAt(right);
            ch[r]++;

            while (ch[r] > 1) {
                char l = a.charAt(left);
                ch[l]--;
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }

    public static String longestSubString(String a) {
        int maxle = 0;
        int start_point = 0;
        int end_point = 0;
        int current_Point = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (map.containsKey(ch) && map.get(ch) >= current_Point) {
                current_Point = map.get(ch) + 1;
            }
            map.put(ch, i);

            if (i - current_Point + 1 > maxle) {
                maxle = i - current_Point + 1;
                start_point = current_Point;
                end_point = i;
            }
        }

        return a.substring(start_point, end_point + 1);
    }
}
