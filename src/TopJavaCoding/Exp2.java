package TopJavaCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*Find the length of the longest substring without repeating the characters */
public class Exp2 {
    public static void main(String[] args) {
        String a ="absbdhedyest";
        System.out.println(longestSubstring(a));
    }

    /* time complexity = O(N) where N is the length of the string
       space complexity = O(min(N,M)) where M is the length of the substring */
    public static int longestSubstring(String a){
        int[] ch = new int[128];
        int left=0,right=0,result =0;

        while(right<a.length()){
            char r = a.charAt(right);
            ch[r]++;

            while(ch[r]>1){
                char l = a.charAt(left);
                ch[l]--;
                left++;
            }
            result = Math.max(result,right - left + 1);
            right++;
        }
        return result;
    }
}
