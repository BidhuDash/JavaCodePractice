package DSA_CODES.Sorting;

/**
 * @Author Bidhu Dash
 * @Date 09-07-2024
 *
 * <p>
 *     Merge sort is a divide-and-conquer algorithm that splits the array into halves, sorts each half, and merges them back together.
 * <p>
 * Algorithm:
 * Divide the array into two halves.
 * Recursively sort each half.
 * Merge the two sorted halves back together.
 * <p>
 * <p>
 * Time Complexity: O(n log n)
 */

public class MergeSort {

    //method that sort num[low..high]
    static void mergeSort(int[] num, int low, int high) {
        if (low < high) {
            //find the middle point
            int middle = (low + high) / 2;

            // recursive sort 1st halve and 2nd halve
            mergeSort(num, low, middle);
            mergeSort(num, middle + 1, high);

            //merge the sorted halves
            merge(num, low, middle, high);
        }
    }

    // method to merge both the halves num[low..mid] & num[mid+1..high]
    static void merge(int[] num, int low, int middle, int high) {
        //find size of two sub arrays to be merged
        int n1 = middle - low + 1;
        int n2 = high - middle;

        //create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        //copy data to temporary arrays
        System.arraycopy(num, low, left, 0, n1);
        System.arraycopy(num, middle + 1, right, 0, n2);

        //merge the temporary arrays
        //initial indexes of first and second sub-arrays
        int i = 0, j = 0;

        //initial index for merge sub array
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                num[k] = left[i];
                i++;
            } else {
                num[k] = right[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of left[] if any
        while (i < n1) {
            num[k] = left[i];
            i++;
            k++;
        }

        //copy remaining element of right[] if any
        while (j < n2) {
            num[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {23, 5, 44, 12, 76, 52, 29, 4};
        System.out.println("unsorted array:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

}

