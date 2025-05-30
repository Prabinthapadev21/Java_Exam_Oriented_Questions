package Practice;
class Multiply{
    public synchronized void multiply(int n)
    {
        for (int i =1;i<=10;i++)
        {
            System.out.println(i*n);
        }
    }
}
class A extends Thread
{
    Multiply m;
    A(Multiply m)
    {
        this.m = m;
    }
    public void run()
    {
        m.multiply(5);
    }
}
class B extends Thread{
    Multiply m;
    B(Multiply m)
    {
        this.m=m;
    }
    public void run()
    {
        m.multiply(10);
    }
}
public class DemoSynchronize {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        A a = new A(m);
        B b = new B(m);
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
    }
}
