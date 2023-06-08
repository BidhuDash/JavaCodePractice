import java.util.Scanner;

public class Pract10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println((int)power(a,b));
    }

    public static double power(double a, double b){
        double pow = Math.pow(a,b);
        return pow;
    }
}
