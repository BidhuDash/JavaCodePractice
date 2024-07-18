package DSA_CODES.Sorting;

/**
 * @Author Bidhu Dash
 * @Date 09-07-2024
 * <p>
 * Quick sort is a divide-and-conquer algorithm that selects a pivot element and partitions the array into two halves,
 * then recursively sorts each half.
 * <p>
 * Algorithm:
 * Choose a pivot element.
 * Partition the array so that elements less than the pivot are on the left, elements greater than the pivot
 * are on the right.
 * Recursively sort the left and right partitions.
 * <p>
 * Time Complexity: O(n log n) on average, O(n^2) in the worst case.
 */
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {23, 5, 44, 12, 76, 52, 29, 4};
        System.out.println("unsorted array:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
