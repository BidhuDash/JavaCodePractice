package BasicJava;

/**
 * @Author Bidhu Dash
 * @Date 29-05-2025
 *
 *  PS:- Print as per the given conditions.
 *      if n is divided by 3 & 5 then FizzBuzz
 *      else if n is divided by only 3 then Fizz
 *      else if n is divided by only 5 then Buzz
 *      else print only n. 
 */
public class Pract72 {

    static void fizzBuzz(int n){
        for (int i = 1; i <= n ; i++) {
            if(i % 3 ==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int i = 15;
        fizzBuzz(i);
    }
}
