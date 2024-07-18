package BasicJava;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pract3 {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 2, 8, 7, 9, 1, 8, 7, 2, 5, 4, 5};
        Arrays.sort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }

        Set<Integer> set = new HashSet<>();
        int i = 0;
        int counter = 0;
        for (int j = 0; j <= a.length; j++) {
            if (a[i] == a[j] && !set.contains(i)) {
                set.add(i);
                i++;
                counter++;
            }

        }
        System.out.println(i + "," + counter);
    }
}



