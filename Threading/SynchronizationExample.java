package Threading;
class MultiplyTable {
    public synchronized void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
    class ThreadsA extends Thread
    {
        MultiplyTable t;
         public ThreadsA(MultiplyTable t)
         {
             this.t=t;
         }

        public void run()
        {
            t.table(5);
        }
    }
    class ThreadsB extends Thread
    {
        MultiplyTable t;
        public ThreadsB(MultiplyTable t)
        {
            this.t = t;
        }
        public void run()
        {
            t.table(10);
        }
    }
public class SynchronizationExample {
    MultiplyTable mt = new MultiplyTable();
    ThreadsA a = new ThreadsA(mt);
    ThreadsB b = new ThreadsB(mt);
    
}
