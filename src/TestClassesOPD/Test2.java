package TestClassesOPD;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1,2,4,2,5,1,67,33,23,3,4,6,2,7,8};
        List<Integer> list= List.of(numbers) ;
        System.out.println("This is the list of distinct numbers in integers");
        List<Integer> list2 = list.stream().distinct().toList();
        for(int i: list2){
            System.out.print(i+" ");
        }
    }
}
