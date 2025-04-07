package MultiThreading;
public class ThreadingImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("This is through runnable ");
    }

    public static void main(String[] args) {
        ThreadingImplementsRunnable tr = new ThreadingImplementsRunnable();
        Thread t = new Thread(tr);
        t.start();
    }
}
