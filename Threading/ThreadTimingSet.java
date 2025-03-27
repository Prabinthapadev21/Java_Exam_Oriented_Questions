package Threading;
class Thread1
{
    public void run()
    {
        for (int i =0;i<10;i++)
        {
            System.out.println("Hi");
        }
    }
}
class Thread2
{
    public void run()
    {
        for (int i =0; i< 10 ;i++)
        {
            System.out.println("hello");
        }
    }
}
public class ThreadTimingSet {
}
