package BasicJava;

import java.util.Scanner;

public class Pract13 {
    public static void main(String[] args) {
        Pract13 obj = new Pract13();
        System.out.println("Enter a number to check all the divisors:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        obj.printDivisor(n);
    }

    public void printDivisor(int n) {
        int div;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
