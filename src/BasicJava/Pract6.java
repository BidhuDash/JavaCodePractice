package BasicJava;

import java.util.Scanner;

public class Pract6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println("1st Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("2nd Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("3rd Quadrant");
        else if (x > 0 && y < 0)
            System.out.println("4th Quadrant");
        else if (x == 0 && (y != 0))
            System.out.println("x axis");
        else if (x != 0)
            System.out.print("y axis");
        else
            System.out.println("Origin");
    }
}
