package BasicJava.BasicJava;

import java.util.Scanner;

public class Pract7 {
    public static long evenSum(int n) {
        long count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                count += i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times the program will run: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            System.out.printf("The sum of all even numbers up to %d is:-> %d ", n, evenSum(n));
            System.out.println();
        }

    }
}
