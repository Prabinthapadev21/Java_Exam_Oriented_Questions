package Threading;
class ThreadA extends Thread
{
    public void run()
    {
        for (int i =0;i<10;i++)
        {
            System.out.println("Hi");
        }
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for (int i =0;i<10;i++)
        {
            System.out.println("Hello");
        }
    }
}
public class ThreadPrirotySet {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        // this sets the priority of the thread but this doesnot run the output parallely
        //due to the speed of the execution of the program and thread sheduled by task scheduler.
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
