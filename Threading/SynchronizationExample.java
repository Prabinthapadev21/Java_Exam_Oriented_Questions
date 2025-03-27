package Threading;
class MultiplyTable
{
    public synchronized void table(int num)
    {
        for (int i = 1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
    class A extends Thread
    {
        public void run()
        {
            
        }
    }

}
public class SynchronizationExample {
    MultiplyTable mt = new MultiplyTable();

}
