package BasicJava;

public class Pract51 implements A1,B1 {
    public static void main(String[] args) {

        A1 a = new Pract51();
        B1 b = new Pract51();
        a.display();
        b.show();

        a.m1();  // overridden default method
        b.m2();  // default method of B1 interface

        A1.staticMethod(); // static method of A1 interface
    }

    public void display(){
        System.out.println("calling the display method");
    }

    @Override
    public void m1() {
        System.out.println("This method is overridden default method of interface A1 i.e. m1()");
    }

    @Override
    public void show(){
        System.out.println("calling the show method");
    }
}

interface A1 {
   void display();
    default void m1(){
        System.out.println("this is the default method of A interface");
    }
    static void staticMethod(){
        System.out.println("this is the static method of interface A1");
    }
}

interface B1{
    void show();
    default void m2(){
        System.out.println("this is the default method od interface B");
    }

}
