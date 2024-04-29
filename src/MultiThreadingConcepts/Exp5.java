package MultiThreadingConcepts;


//Locking in java basically two types (a)object level lock && (b) Class level lock
public class Exp5 implements Runnable {
    public static void main(String[] args) {
        Exp5 obj1 = new Exp5();
        Thread t1 = new Thread(obj1, "Thread 1");
        Thread t2 = new Thread(obj1, "Thread 2");

        Exp5 obj2 = new Exp5();
        Thread t3 = new Thread(obj2, "Thread 3");

        System.out.println(t1.getPriority());
        t1.start();
        System.out.println(t2.getPriority());
        t2.start();
        System.out.println(t3.getPriority());
        t3.start();


    }

    @Override
    public void run() {
        Lock();
    }

    public void Lock() {
        System.out.println(Thread.currentThread().getName());
        //Object level lock
        synchronized (this) {
            System.out.println("this is object level lock");
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }

        //class level lock
//        synchronized (Exp5.class) {
//            System.out.println("this is class level lock");
//            System.out.println("in block " + Thread.currentThread().getName());
//            System.out.println("in block " + Thread.currentThread().getName() + " end");
//        }
    }
}
