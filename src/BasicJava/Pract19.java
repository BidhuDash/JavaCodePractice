package BasicJava;

import java.util.Scanner;


//program to check certain operation with a given 1D array
public class Pract19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:-");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter only distinct elements into the array");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        //maxMin(arr);

        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();

        int check = search(arr, a, x);
        if (check == -1)
            System.out.println("the searched element is not in this array");
        else
            System.out.printf("\n" + "The searched element is at index %d of the array", check);
    }

    static int search(int[] arr, int n, int x) {
        int i;
        //int count;
        for (i = n - 1; i > 0; i--) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    static void maxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int j : arr) {
            if (max < j)
                max = j;
            if (min > j)
                min = j;
        }
        System.out.println("max:-" + max);
        System.out.println(("min:-" + min));
    }
}
