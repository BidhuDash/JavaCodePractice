package TopJavaCoding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Bidhu Dash
 * @Date 17-07-2024
 */
public class Exp6_allSumPairsOFInt {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,9,2,9,4,6,7,8,9);
        int key = 3;

        findPairsWithSum(list,key);

    }

    static void findPairsWithSum(List<Integer> list, int key) {
       // Map<Integer, List<Integer>> sumToPairsMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if (sum == key) {
                    System.out.println("Pair: (" + list.get(i) + ", " + list.get(j) + ")");
                }
            }
        }

    }
}
