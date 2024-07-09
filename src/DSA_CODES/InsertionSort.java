package DSA_CODES;

/**
 * @Author Bidhu Dash
 * @Date 09-07-2024
 * Insertion sort builds the sorted array one item at a time by comparing each new element to the ones already sorted and inserting it in the correct position.
 * <p>
 * Algorithm:
 * Start with the second element.
 * Compare it to the elements before it and insert it in the correct position.
 * Repeat for all elements.
 * <p>
 * Time Complexity: O(n^2)
 */
public class InsertionSort {

    static void insertionSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j <= 0 && numbers[i] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {23, 5, 44, 12, 76, 52, 29, 4};
        System.out.println("unsorted array:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertionSort(numbers);
        System.out.println("Sorted array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
