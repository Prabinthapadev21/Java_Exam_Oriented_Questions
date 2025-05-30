package Practice;
class ThreadDemo extends Thread
{
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("child Thread");
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        ThreadDemo d = new ThreadDemo();
        d.start();
        for (int i =0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
