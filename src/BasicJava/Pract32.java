package BasicJava;

import java.util.Scanner;

class Pract32 {
    int l;
    int b;

    public static void main(String[] args) {
        Pract32 pract32 = new Pract32();
        Scanner sc = new Scanner(System.in);
        pract32.l = sc.nextInt();
        pract32.b = sc.nextInt();

        System.out.println(pract32.area(pract32.l, pract32.b));
    }

    float area(int l, int b) {
        float a = l * b;
        return a;
    }
}

