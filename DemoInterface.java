public class DemoInterface {
    interface Calculation {
        void calculation();
    }

    static class Addition implements Calculation {
        public void calculation() {
            int a = 10, b = 20;
            System.out.println("Sum = " + (a + b));
        }
    }

    public static void main(String[] args) {
        Calculation c = new Addition();
        c.calculation();
    }
}
