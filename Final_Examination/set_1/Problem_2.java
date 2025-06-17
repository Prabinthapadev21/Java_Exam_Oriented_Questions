package Final_Examination.set_1;
////Write a Java program using threads: one thread prints numbers 1–100, another thread prints multiples of 5 from 1–100.
class NaturalNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Natural: " + i);
        }
    }
}

class MultiplesOfFive extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Multiple of 5: " + i);
            }
        }
    }
}

public class Problem_2 {
    public static void main(String[] args) {
        NaturalNumbers naturalThread = new NaturalNumbers();
        MultiplesOfFive multipleThread = new MultiplesOfFive();

        // Optional: set priority
        naturalThread.setPriority(Thread.MAX_PRIORITY);
        multipleThread.setPriority(Thread.MIN_PRIORITY);

        // Start both threads
        naturalThread.start();
        multipleThread.start();
    }
}
