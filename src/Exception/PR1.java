package Exception;

public class PR1 {

    public static void main(String[] args) {
    interface_C forA = new A();
    forA.Show();
    interface_C forB = new B();
    forB.Show();
    }
}

class A implements interface_C{
    public void Show(){
        System.out.println("This the method of A class calling");
    }

}
class B implements interface_C{
    public void Show(){
        System.out.println("This the method of B class calling");
    }

}
interface interface_C{
    public void Show();
}
