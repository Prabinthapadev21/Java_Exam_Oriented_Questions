package Practice;
class DemoRunnable implements Runnable
{
public void run()
{
    for(int i =0;i<10;i++)
    {
        System.out.println("zChild thread");
    }
}
}

public class RunnableDemo {
    public static void main(String[] args) {
        DemoRunnable d = new DemoRunnable();
        Thread t = new Thread(d);
        t.start();
        for(int i =0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
