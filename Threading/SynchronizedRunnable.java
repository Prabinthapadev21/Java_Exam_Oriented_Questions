package Threading;
class Multiply
{
    public synchronized void multiplytable(int num)
    {
        for (int i =1;i<=10;i++)
        {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
class ThreadOne implements Runnable
{
    Multiply m;
    public ThreadOne(Multiply m)
    {
        this.m=m;
    }
    public void run()
    {
        m.multiplytable(5);
    }
}
class ThreadTwo implements Runnable
{
    Multiply m;
    public ThreadTwo(Multiply m)
    {
        this.m=m;
    }
    public void run()
    {
        m.multiplytable(10);
    }
}
public class SynchronizedRunnable {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        ThreadOne t1 = new ThreadOne(m);
        ThreadTwo t2 = new ThreadTwo(m);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
