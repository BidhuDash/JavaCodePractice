package DSA_CODES.Sorting;

/**
 * @Author Bidhu Dash
 * @Date 09-07-2024
 * <p>
 * Selection sort repeatedly finds the minimum element from the unsorted part and puts it at the beginning.
 * <p>
 * Algorithm:
 * Find the minimum element in the unsorted part of the array.
 * Swap it with the first unsorted element.
 * Move the boundary of the sorted part one element to the right.
 * Repeat the process until the array is sorted.
 * <p>
 * Time Complexity: O(n^2)
 */
public class SelectionSort {

    static void selectionSort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int midIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[midIndex]) midIndex = j;
            }
            int swap = num[midIndex];
            num[midIndex] = num[i];
            num[i] = swap;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {23, 5, 44, 12, 76, 52, 29, 4};
        System.out.println("unsorted array:");
        for(int i:numbers){
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(numbers);
        System.out.println("Sorted array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
