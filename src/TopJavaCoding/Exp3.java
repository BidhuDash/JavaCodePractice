package TopJavaCoding;
/* Here given an array we have rotate it to its step size provided.
 * exp1) i/p == size of array = 8
 *              elements of the array = 7 5 2 11 2 43 1 1
 *              step size to rotate the array =2
 *       o/p== 2 11 2 43 1 1 7 5
 *
 * exp2) i/p == size of array = 4
 *              elements of the array = 5 6 7 8
 *              step size to rotate the array = 3
 *       o/p== 8 5 6 7
 * */

public class Exp3 {
    public static void main(String[] args) {
        int[] a = {7,5,2,11,2,43,1,1};
        int step = -3;
        for (int i : rotateArray(a, step)) {
            System.out.print(i + " ");
        }
    }

    public static int[] rotateArray(int[] a, int step) {
        int len = a.length;
        step = step % len;
        if (step < 0)
            step += len;              // this is used if step value is negative

        int[] temp = new int[step];
        for (int i = 0; i < step; i++) {
            temp[i] = a[i];
        }
        for (int i = step; i < len; i++) {
            a[i - step] = a[i];
        }
        for (int i = 0; i < step; i++) {
            a[len - step + i] = temp[i];
        }
        return a;
    }
}
