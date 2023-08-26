package TopJavaCoding;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 extends Thread {



    public static <IOExceptionException> void main(String[] args) {

        try{
            int a = 23/0;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }



        Thread a = new Thread();
        a.start();
        System.out.println(a.getState());
        a.stop();
        System.out.println(a.getState());





    }
}
