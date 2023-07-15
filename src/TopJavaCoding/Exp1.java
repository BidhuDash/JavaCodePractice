package TopJavaCoding;

import java.util.HashMap;
import java.util.Map;

/*  Sum of two numbers

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */
public class Exp1 {
    public static void main(String[] args) {
       // int[] a = {0, 3, 7, 5, 9, 6};
        int[] a = {2,5,5,11};
        Exp1 obj = new Exp1();
        for (int i : obj.twoSum1(a, 10)) {
            System.out.print(i+",");
        }
    }

    public int[] twoSum1(int[] num,int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[j] == target - num[i])
                    return new int[] {i,j};
            }
        }
        return null;
    }

    /* here we have to check each element but without rechecking the elements twice  */
    public int[] twoSum2(int[] num, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<num.length;i++){
            int pointer = num[i];
            int x = target - pointer;
            if(map.containsKey(x)){
                return new int[] {map.get(x),i};
            }
            map.put(pointer,i);
        }
        return null;
    }
}
