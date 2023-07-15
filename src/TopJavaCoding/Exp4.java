package TopJavaCoding;

import java.util.*;


//find the second-largest number in a given array.
public class Exp4 {
    public static void main(String[] args) {
        int[] arr = {32, 9, 0, 18, 11, 4, 9};
        //Arrays.fill(arr,66);    // fill the entire array with value as 66
        for (int i : arr) {
            System.out.print(i + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + secondLargest(arr));
        System.out.println("Enter to number to search in the given array:-");
        // binarySearch(arr,sc.nextInt());

        List<Object> ls = Arrays.asList(1, 3, "bidhu", 66.5f, true, arr);
        System.out.println(ls);


        // TODO: 31-07-2023 here you have to implement the logic for the array

        List<Integer> list = Arrays.asList(1, 3, 0, 10, 5, 9, 13, 12);
        givenPair(list, 6);

        //reqPair(arr, 18);
    }

    public static int secondLargest(int[] a) {
        Arrays.sort(a);
        return a[a.length - 2];
    }

    public static void binarySearch(int[] a, int num) {
        if (Arrays.binarySearch(a, num) < 0)
            System.out.println("the number is not present");
        else System.out.println("the number is present");
    }


    /* here this method has a time complexity of O(n) and space complexity of O(n)
     *  returns the value in pair of the */
    public static void givenPair(List<Integer> lst, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num1 : lst) {
            int num2 = target - num1;
            if (map.containsKey(num2))
                System.out.println("pair " + num1 + "," + num2);

            map.put(num1,num2);
        }

    }

    public static void reqPair(int[] a, int target) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println("pair (" + a[i] + "," + a[j] + ")");
                }
            }
        }
        //System.out.println("pair doesn't found");
    }
}
