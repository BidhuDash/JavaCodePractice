package BasicJava;

public class Pract59_2ArraysMerger {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{2, 3, 4, 5, 6, 7};

        int a = arr1.length;
        int b = arr2.length;
        int c = a + b;
        int[] arr3 = new int[c];
        System.arraycopy(arr1, 0, arr3, 0, a);
        System.arraycopy(arr2, 0, arr3, a, b);

        for (int x : arr3) {
            System.out.print(x + " ");
        }

    }
}
