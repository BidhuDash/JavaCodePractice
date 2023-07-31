package BasicJava;

import java.util.Scanner;

public class Pract16_Prime {
    public static int totalPrime(int s, int e) {
        int cp = 0;
        for (int i = s; i <= e; i++) {
            if (isPrime(i)) {
                cp++;
                System.out.print(i + " ");
            }
        }
        return cp;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range between which you want to get the prime numbers:-");
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("\n" + "Total_Prime are:-" + totalPrime(s, e));
    }
}
