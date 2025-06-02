package TestClassesOPD;

public class TEST1 {

    public static void main(String[] args) {
        String[] aa = new String[]{"b","i","d","h","u"};
        for (String s : aa) {
            System.out.println(s);
        }

        int[] a = {16, 17, 3, 4, 5, 2};
        int n = a.length;

        // Output array (maximum possible size is n)
        int[] temp = new int[n];
        int index = 0;

        int maxFromRight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxFromRight) {
                temp[index++] = a[i];
                maxFromRight = a[i];
            }
        }

        // Reverse the result array
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[index - 1 - i];
        }

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
