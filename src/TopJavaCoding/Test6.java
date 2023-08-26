package TopJavaCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test6 {

    public static void method() throws Exception
    {
        try {
            throw new Exception();
        }
        finally {
            System.out.print("Finally ");
        }
    }
    public static void main(String args[])
    {
        try
        {
            method();
        }
        catch (Exception e) {
            System.out.print("Exception ");
        }
        System.out.print("Caught");
    }

//        String a= "bidhu";
//        String b = "Bidhu";
//        String d = new String("Bidhu");
//        String e = "Bidhu";
//        int c = 45;
//
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(d)); // true
//        System.out.println(b==d); // false
//        System.out.println(a==d);
//        System.out.println(b==e);
//        System.out.println(b.equals(e));




}



