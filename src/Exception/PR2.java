package Exception;

import javax.swing.*;

public class PR2 {

    public static boolean validate(int amount){
        if(amount<45000)
            throw new InsufficientFundException("This is insufficient");
        return true;


    }
    public static void main(String[] args) {

        System.out.println(validate(25000));
    }
}

class InsufficientFundException extends RuntimeException{

    public InsufficientFundException(String str){
        super(str);
    }
}

