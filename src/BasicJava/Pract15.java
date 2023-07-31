package BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class Pract15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // The integer value to convert

        String numberString = String.valueOf(number);
        int[] array = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }

        System.out.println("Number: " + number);
        System.out.println("Integer array: " + Arrays.toString(array));
    }
}
