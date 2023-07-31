package BasicJava.BasicJava;

import java.util.Scanner;

public class Pract1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("(1) Enter the len and breadth of the rectangle");
            int len = sc.nextInt();
            int bre = sc.nextInt();
            System.out.println("the area of the rectangle is "+ len * bre);

            System.out.println("(2) Enter the name and age in next line to print in a single line:");
            String name = sc.next();
            int age = sc.nextInt();
            System.out.printf("The name is %s and the age is %d",name, age);
        }
    }
