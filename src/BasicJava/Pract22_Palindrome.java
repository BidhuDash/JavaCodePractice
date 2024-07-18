package BasicJava;

import java.util.Scanner;

// program to check whether the given string is palindrome or not.
public class Pract22_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String name = sc.next(); //type a word to check whether its palindrome or not

        //logic
        name.toLowerCase();
        int low = 0;
        int high = name.length() - 1;
        int flag = 0;

        while (low < high) {
            if (name.charAt(low) != name.charAt(high)) {
                flag = 1;
                break;
            }
            low++;
            high--;
        }

        if (flag == 0) {
            System.out.println("The given String is a Palindrome");
        } else
            System.out.println("This given string is NOT a palindrome");
    }
}
