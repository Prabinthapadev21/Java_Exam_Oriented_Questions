public class CreatingThread extends Thread
{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        CreatingThread t1 = new CreatingThread();
        t1.start();
        System.out.println("Main thread is running");
    }
}