package BasicJava;

/**
 * @Author Bidhu Dash
 * @Date 20-05-2025
 */
public class Pract69 {
    public static void main(String[] args) {

        /* X x  =  new X();   --->> coz abstract class cannot be instantiated. */

        Y y = new Y();
        y.sum();

        X x = new Y();
        x.sum();

        Z z = new Z() {
            @Override
            void sum() {
                System.out.println("anonymises class inside Z type constructor");
            }
        };
        z.sum();

        Z zz = new Z();
        zz.sum();
    }
}

abstract class X {
    abstract void sum();

}
class Y extends X{

    void sum(){
        System.out.println("method of y");
    }
}
class Z extends X{

    @Override
    void sum() {
        System.out.println("method of Z");
    }
}