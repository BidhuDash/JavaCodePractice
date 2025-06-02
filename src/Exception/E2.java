package Exception;

import java.util.Scanner;

/**
 * @Author Bidhu Dash
 * @Date 02-06-2025
 *
 *  Creating custom Exception
 */
public class E2 {

    static boolean validate(int amount){
        if(amount < 30000) throw new InsufficientAmountException("No Minimum Balance");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check:-");
        if(validate(sc.nextInt())) System.out.println("Balance Available");

        sc.close();
    }
}

class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String str){
        super(str);
    }
}
