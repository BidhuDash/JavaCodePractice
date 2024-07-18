package TopJavaCoding;

import java.io.IOException;

/**
 * @Author Bidhu Dash
 * @Date 10-07-2024
 *
 *
 */
public class Test20 {

        public static void main(String[] args) {

        String name = "Bidhu";
        String nama = "Bidhu";
        String name1 = new String("Bidhu");
        System.out.println(name == nama);
        System.out.println(name.equals(nama));
        System.out.println(name.equals(name1));
        System.out.println(name == name1);

        try {
            B b = new B();
            b.m1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class A {
    void m1() throws IOException {
        System.out.println("This is the m1() of A");
    }
}

class B extends A {
    @Override
    void m1(){ //throws Exception {
        System.out.println("This is the m1() of B");
    }
}
