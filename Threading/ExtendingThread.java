package Threading;
//Here the MYThread is a new thread made by me which extends the property of the Thread
 class MyThread extends Thread{
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("child Thread");
        }
    }
}
public class ExtendingThread
{
    public static void main(String[] args) {
        MyThread mt = new MyThread();//here we are creating the object of our thread
        mt.start();
        for (int i =0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}