package Practice;

class Demos {
    public void add() {
        int a = 20;
        int b = 30;
        int c = a + b;
        System.out.println(c);
    }

    public void add(int a, int b) {
        int c = a * b;
        System.out.println(c);

    }
}
    public class Demo{
        public static void main(String[] args){
            Demos obj = new Demos();
            obj.add();
            obj.add(30,40);
        }
    }
