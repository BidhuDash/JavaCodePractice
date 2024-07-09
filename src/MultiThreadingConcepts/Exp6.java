package MultiThreadingConcepts;

public class Exp6 {
    public static void main(String[] args) throws InterruptedException {

        Async  async = new Async();
        // here the main thread be can be used for handling multi-threads working concurrently
        async.t.start();

        Sync sync = new Sync();
        // here the main thread has to wait for the object thread to completes its executions or wait until object
        // thread terminates then the program will continue with the main thread.
        sync.j.start();
        sync.j.join();
    }
}

class Async{
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("this is async programming");
        }
    });
}

class Sync{
    Thread j = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("this is Sync programming");
        }
    });
}
