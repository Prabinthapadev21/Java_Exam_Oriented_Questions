package Threading;
class Table {
    public synchronized void multiplytable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
    class ThreadsA extends Thread
    {
        Table t;
         public ThreadsA(Table t)
         {
             this.t=t;
         }

        public void run()
        {
            t.multiplytable(5);
        }
    }
    class ThreadsB extends Thread
    {
        Table t;
        public ThreadsB(Table t)
        {
            this.t = t;
        }
        public void run()
        {
            t.multiplytable(10);
        }
    }
public class SynchronizationExample {
    public static void main(String[] args) {
        Table t = new Table();
        ThreadsA t1 = new ThreadsA(t);
        ThreadsB t2 = new ThreadsB(t);
        t1.start();
        t2.start();
    }
}
