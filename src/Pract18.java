import java.util.Scanner;


// program to add two arrays
public class Pract18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1D arrays:-");
        int a =sc.nextInt();
        int b = sc.nextInt();

        int arr1[] = new int[a];
        int arr2[]= new int[b];
        System.out.println("enter arr1 element:-");
        for(int i=0;i<a;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("enter arr2 element:-");
        for(int j=0;j<b;j++){
            arr2[j]=sc.nextInt();
        }

        int result =0;
        for(int i=0;i<arr1.length;i++){
            result+=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            result+=arr2[i];
        }
        System.out.println(result);
    }
}
