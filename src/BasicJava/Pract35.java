package BasicJava;

public class Pract35 {
    public static void main(String[] args) {
        String a = "this";
        A a1 = new B(a);
        System.out.println("------------------");
        A a2 = new B(a);  // parent class object reference can hold child class object
        System.out.println("------------------");
       // BasicJava.B b1 = new BasicJava.B(a);
        Pract32 obj3 = new Pract32();
    }
}
class A {
    public A() {
        System.out.println("default constructor of BasicJava.A");
    }
    public A(int no){
        System.out.println("This is the constructor of class BasicJava.A "+ no);
    }
}
class B extends A{
    public B(String val){
        System.out.println("This is the constructor of class BasicJava.B:"+ val );
    }
    public void show(){
        System.out.println("discrete method of class BasicJava.B");
    }
}
class C extends B{
    public C(String val) {
        super(val);
        System.out.println("this is the constructor of class BasicJava.C"+ val);;
    }

    @Override
    public void show() {
        super.show();
    }
}