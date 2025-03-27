package Threading;
// here we are creating our thread using runnable interface.
class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        for (int i =0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
}
