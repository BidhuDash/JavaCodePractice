package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Pract47 {
    public static void main(String[] args) {
        String a = "adbde";

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                ls.add(a.substring(i, j));
            }
        }
        ls.forEach(System.out::println);  // printed the substring using lambda


        List<Integer> intype = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            intype.add(i);
        }
        //consumer functions, bi-consumer functions
        intype.forEach(i -> System.out.print(i + " "));

        // find the prime numbers from the 1 to 100 range
        System.out.println("\n" + "The prime numbers are :-");
        for (int i = 0; i < 100; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + "-----------");

        System.out.println(Arrays.toString(sumWithCond(intype, n -> true)));
        System.out.println(sumWithCond(intype, n -> n != 9));
        System.out.println(sumWithCond(intype, n -> n % 2 == 0));


    }

    //using lambda function logic of prime number
    public static boolean isprime(int num) {
        return num > 1 && IntStream.range(2, num).noneMatch(item -> num % item == 0);
        // return num > 1 && IntStream.range(2,100)
    }

    public static int[] sumWithCond(List<Integer> ls, Predicate<Integer> pr) {
        return ls.stream().filter(pr).mapToInt(i -> i).toArray();
    }
}
