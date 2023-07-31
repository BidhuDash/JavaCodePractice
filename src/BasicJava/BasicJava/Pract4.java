package BasicJava.BasicJava;

import java.util.Scanner;

public class Pract4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check: ");
        char ch = sc.next().charAt(0);  // take input as a single char
        if (Character.isUpperCase(ch))
            System.out.println("1"); // if the char is capital case
        else if (Character.isLowerCase(ch))
            System.out.println("0"); // if the char is small case
        else
            System.out.println("out of order"); // if the char is other than alphabets

    }
}
