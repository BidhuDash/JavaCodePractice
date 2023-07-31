package BasicJava;

import java.util.Scanner;

public class Pract11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to find the factorial:-");
        int num = sc.nextInt();
        try {
            System.out.println((long) fact(num));
        } catch (Exception e) {
            System.out.println("Error:-" + e.getMessage());
        }

    }

    public static double fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0)
            throw new IllegalArgumentException("We cannot find the factorial of any negative numbers");
        else {
            return n * fact(n - 1);
        }
    }
}
