package BasicJava;

import java.util.Arrays;

public class Pract54_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {34, 65, 22, 11, 98, 44};

        //binary search works on sorted array
        int[] sortedarray = Arrays.stream(arr).sorted().toArray();
        int key = 44;
        int last = arr.length - 1;
        //binarySearch(sortedarray, 0, last, key);
        binarySearch2(sortedarray,key);
    }


    //using java logic
    public static void binarySearch(int[] a, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (a[mid] < key)
                first = mid + 1;
            else if (a[mid] == key) {
                System.out.println("element found at index:-" + mid);
                break;
            } else
                last = mid - 1;

            mid = (first + last) / 2;
        }
        if (first > last)
            System.out.println("element not found in the array");
    }


    //using inbuilt Arrays.binary Search method
    public static void binarySearch2(int[] a, int key) {
        int result = Arrays.binarySearch(a, key);
        if (result < 0)
            System.out.println("Element not found in the array");
        else System.out.println("Element found at the index:-" + result);

    }
}
