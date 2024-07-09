package DSA_CODES;

/**
 * @Author Bidhu Dash
 * @Date Bubble sort repeatedly swaps adjacent elements if they are in the wrong order.
 * Algorithm:
 * <p>
 * Compare each pair of adjacent elements.
 * Swap them if they are in the wrong order.
 * Repeat the process until no swaps are needed.
 * <p>
 * Time Complexity: O(n^2)
 */

public class BubbleSort {

    static void bubbleSort(int[] num) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) { // outer loop
            for (int j = 0; j < n - 1 - i; j++) { // inner loop
                // swap num[j] & numb[j+1]
                if (num[j] > num[j + 1]) {
                    int swap = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {23, 5, 44, 12, 76, 52, 29, 4};
        bubbleSort(numbers);
        System.out.println("Sorted array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

}
