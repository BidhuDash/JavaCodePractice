package BasicJava.MultiThreadingConcepts;

public class Exp4 extends Thread {
    public static void main(String[] args) {
        Exp4 t1 = new Exp4();
        Exp4 t2 = new Exp4();


        // here new call stack will be created in the main stack for each thread that is started.
        t1.start();
        t2.start();


        // if we directly call the run method their object will be called as normal object not thread objects.
        // and will be call stack will be created in the main thread itself no new call stack will be created for
        // individual thread methods.
        t1.run();
        t2.run();


    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
