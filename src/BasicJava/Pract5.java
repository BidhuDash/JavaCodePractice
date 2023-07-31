package BasicJava;

import java.util.Scanner;

public class Pract5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary and grade to find the Total salary:");

        int sal = sc.nextInt();
        char grad = sc.next().charAt(0);
        grad = Character.toUpperCase(grad);

        double hra = 0.2 * sal;
        double da = 0.5 * sal;
        double pf = 0.11 * sal;

        double total_sal;

        if (grad == 'A') {
            total_sal = (sal + hra + da + 1700) - pf;
            System.out.println("Total salary is:-" + (long) total_sal);
        } else if (grad == 'B') {
            total_sal = (sal + hra + da + 1500) - pf;
            System.out.println("Total salary is:-" + (long) total_sal);
        } else {
            total_sal = (sal + hra + da + 1300) - pf;
            System.out.println("Total salary is:-" + (int) Math.round(total_sal));
        }
    }
}
