package BasicJava.MultiThreadingConcepts;

import java.util.Arrays;

public class Exp3 {
    public static void main(String[] args) {
        Thread t1 = new Thread("This is my first thread");

        System.out.println(t1.getName());
        System.out.println(t1.getState());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
        System.out.println(Arrays.toString(t1.getStackTrace()));
        t1.start();
        System.out.println(t1.getState());

        Thread t2 = new Thread("This is the second thread");
        //t2.start();
        System.out.println(t2.getName());
        System.out.println(t2.getPriority());
    }
}
