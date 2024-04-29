package MultiThreadingConcepts;

public class Exp1 implements Runnable{

    @Override
    public void run() {

        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("The state of the thread method:-"+ThreadState.t1.getState());
        try {
            Thread.sleep(400);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //Thread t1 = new Thread();

//        t1.start();
//        System.out.println(Thread.currentThread());
//        System.out.println(t1.getId());  //provides the id of the thread
//        System.out.println(t1.getState());
    }
}

class ThreadState implements Runnable{

    public static Thread t1;
    public static ThreadState obj;

    @Override
    public void run() {
        Exp1 newobj = new Exp1();
        Thread t2 = new Thread(newobj);

        System.out.println("the state of t2 thread is in spawning:-"+t2.getState());
        t2.start();
        System.out.println("the state of t2 thread after calling the start method:-"+t2.getState());

        try{
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("the state of t2 thread after invoking it:-"+t2.getState());
        try{
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The state of thread t2 when it has completed it's execution :-" + t2.getState());
    }

    public static void main(String[] args) {
        obj = new ThreadState();
        t1= new Thread(obj);

        System.out.println("The state of thread t1:-"+t1.getState());
        t1.start();
        System.out.println("The state of thread t1 after invoking the start method:-"+t1.getState());
    }
}
