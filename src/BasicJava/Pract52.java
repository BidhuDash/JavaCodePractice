package BasicJava;

import java.util.Arrays;

public class Pract52 {
    public static void main(String[] args) {
        int[] a = {61, 22, 93, 54, 6, 71, 38, 84, 99};

        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }

        int[] b = {1, 2, 4, 5, 23, 6};
        int[] c = new int[a.length + b.length];

        for (int i : a) {
            c[i] = a[i];
            System.out.print(c[i] + " ");
        }
        System.out.println();
        if (c.length - a.length >= 0) System.arraycopy(b, a.length, c, a.length, c.length - a.length);

        for (int i : c)
            System.out.print(c[i] + " ");
    }
}
