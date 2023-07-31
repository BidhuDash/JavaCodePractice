package BasicJava;

import java.util.Scanner;

public class Pract17 {
    public static void main(String[] args) {

        Pract17 obj = new Pract17();
        Scanner sc = new Scanner(System.in);


        Integer[] a = new Integer[5];  // Generic type integer
        System.out.println("Enter the values for the array:-");
        /*for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }*/
        System.out.println();
        //obj.printArr(a);

        String[] b = new String[3];

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.next();
        }
        obj.printArr(b);

    }

    // making a print method Generic type for printing all array type.
    public <GenericArrayType> void printArr(GenericArrayType[] a) {
        for (GenericArrayType i : a) {
            System.out.print(i + " ");
        }
    }
}
