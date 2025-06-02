package DSA_CODES.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Bidhu Dash
 * @Date 07-05-2025
 *
 * given an arr[16,17,18,22,34,1,80,2,4,13]
 */
public class A2 {

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int[] arr = {16,17,18,22,34,1,80,2,4,13};
        int n = arr.length, index = 0;

        int maxFromRight = Integer.MIN_VALUE;

        for(int i = n-1;i>=0;i--){
            if(arr[i]> maxFromRight){
                result.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        Collections.reverse(result);
        System.out.println(result);

    }
}