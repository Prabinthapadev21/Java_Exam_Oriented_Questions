package MultiThreading;
class Multiply
{
    public synchronized void multiply(int num)
    {
        for (int i =1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
}
class D extends Thread
{
    Multiply m;
    public D(Multiply m)
    {
        this.m = m;
    }

    @Override
    public void run() {
        m.multiply(5);
    }
}
class E extends Thread
{
    Multiply m;
    public E(Multiply m)
    {
        this.m=m;
    }
    @Override
    public void run() {
        m.multiply(10);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        D d = new D(m);
        E e = new E(m);
        d.setPriority(Thread.MIN_PRIORITY);
        e.setPriority(Thread.MAX_PRIORITY);
        d.start();
        e.start();
    }
}
