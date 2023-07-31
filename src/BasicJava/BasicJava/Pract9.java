package BasicJava.BasicJava;

import java.util.Scanner;

public class Pract9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number to find the sum of even and odd digits:-");
        int num = sc.nextInt();
        int even =0;
        int odd =0;

        while (num>0){
            int digit = num % 10;  // to eliminate the digits place.
            if(digit % 2 == 0)
                even +=digit;
            else
                odd +=digit;

            num /=10;  // to delete the 1's place
        }

        System.out.printf("The sum of even digits are %d and the sum of odd digits are %d",even,odd);

    }
}
