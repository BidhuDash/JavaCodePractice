package BasicJava;

import java.util.Scanner;

public class Pract12 {
    public static long fibonacci(int n) {
        if (n <= 0) throw new IllegalArgumentException("Invalid input n must be a positive integer.");

        if (n <= 2) return 1;

        long[][] baseMatrix = {{1, 1}, {1, 0}};
        long[][] resultMatrix = matrixPower(baseMatrix, n - 2);
        return resultMatrix[0][0];
    }

    public static long[][] matrixPower(long[][] matrix, int power) {
        if (power == 1) return matrix;

        long[][] halfPowerMatrix = matrixPower(matrix, power / 2);
        long[][] resultMatrix = multiplyMatrix(halfPowerMatrix, halfPowerMatrix);

        if (power % 2 == 1) resultMatrix = multiplyMatrix(resultMatrix, matrix);

        return resultMatrix;
    }

    public static long[][] multiplyMatrix(long[][] matrix1, long[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        long[][] resultMatrix = new long[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    resultMatrix[i][j] %= 1000000007; // Modulo operation to prevent overflow
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases to rum the program:-");
        int test_num = sc.nextInt(); // BasicJava.BasicJava.test case run times
        for (int i = 0; i < test_num; i++) {
            System.out.println("Enter the desired fibonacci digit's place");
            int n = sc.nextInt(); // The desired Fibonacci number

            try {
                long fibonacciNumber = fibonacci(n);
                System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            /*finally {
                sc.close();      // we have to close the scanner, here the scanner is getting close
            }*/
        }
    }
}
