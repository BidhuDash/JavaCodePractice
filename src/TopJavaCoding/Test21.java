package TopJavaCoding;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Bidhu Dash
 * @Date 16-05-2025
 */
public class Test21 {

    //brute-force technique.
    // This has a time complexity of O(n2) and space complexity of O(1)
    static int[] getSumPairsBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //optimized technique using Hashmap
    static int[] getSumPairsOptimized(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = target - arr[i];
            if (map.containsKey(count)) {
                return new int[]{map.get(count), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 7, 8};
        int target = 10;

        //brute-force technique.
        int[] finalArr = getSumPairsBruteForce(arr, target);
        System.out.println(finalArr[0] + "," + finalArr[1]);

        //Optimized technique.
        int[] finalArrr = getSumPairsOptimized(arr, target);
        System.out.println(finalArrr[0] + "," + finalArrr[1]);

    }
}
