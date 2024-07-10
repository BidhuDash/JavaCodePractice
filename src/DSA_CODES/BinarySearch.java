package DSA_CODES;
/**
 * @Author Bidhu Dash
 * @Date
 *
 * Algorithm:
 * Start with the middle element of the sorted array.
 * If the key matches the middle element, return the index.
 * If the key is less than the middle element, search in the left half.
 * If the key is greater than the middle element, search in the right half.
 * Repeat the process until the key is found or the search interval is empty
 *
 * time complexity O(log n)
 *
 */

public class BinarySearch {

    static int biSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {3,6,11,23,42,56,22};
        int key = 11;

        int index = biSearch(array,key);
        if(index == -1){
            System.out.println("the element is not present int the list");
        }
        else System.out.println(index);
    }
}
