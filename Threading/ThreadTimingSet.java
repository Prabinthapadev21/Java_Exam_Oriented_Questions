package Threading;
class Thread1 extends Thread
{
    public void run()
    {
        for (int i =0;i<100;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(2);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for (int i =0; i< 100 ;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(2);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadTimingSet {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
