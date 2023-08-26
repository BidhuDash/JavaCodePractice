package BasicJava.MultiThreadingConcepts;

public class Exp2 extends Thread{

//    public void run(){
//        String name ="run class method";
//        System.out.println(name);
//    }

    public static void main(String[] args) {
        Exp2 t1=new Exp2();
        //System.out.println(t1.getClass());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }
}
