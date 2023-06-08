import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// reverse an arraylist after a certain index and print the whole arraylist
// i/p:- arrlst1 ={1,2,3,4,5,6} change index 3  then o/p arrlst2={1,2,3,4,6,5}

public class Pract20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the times of test case:-");
        int tst = sc.nextInt();
        int a=0;
        while(a<tst){
            System.out.println("enter the size of the arrayList");
            int N = sc.nextInt();
            System.out.println("Enter the index after that we shall reverse the array");
            int Y =sc.nextInt();
            ArrayList <Integer> arr = new ArrayList<>();
            System.out.println("Enter the elements into the arrayList");
            for(int i=0;i<N;i++){
                arr.add(sc.nextInt());
            }

            System.out.println("updated array/required array:");
            reverseArray(arr,Y);
            a++;
        }

    }
        static void  reverseArray(ArrayList<Integer> arrayList,int y){
            ArrayList<Integer> up_arr = new ArrayList<>(arrayList.size());
            for(int i=0;i<=y;i++){
                up_arr.add(i,arrayList.get(i));
            }
            Collections.reverse(arrayList.subList(y+1,arrayList.size()));
            //System.out.println(arrayList.subList(y+1,arrayList.size()));
            up_arr.addAll(arrayList.subList(y+1,arrayList.size()));
            //System.out.println(up_arr);
            for(int i:up_arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
}
