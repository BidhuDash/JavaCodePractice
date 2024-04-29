package TopJavaCoding;

import java.util.Arrays;

public class Test8 extends Thread {

    public static void main(String[] args) {

        String a = "Bidhu";
        String b = new String("Bidhu");
        String c = new String("Bidhu");
        String d = a.intern();

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==d); //
        System.out.println(Arrays.toString(a.getBytes()));
        System.out.println(b.intern());

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());


    }
}
