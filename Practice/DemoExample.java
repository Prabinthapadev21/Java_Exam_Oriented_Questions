package Practice;
class Aanimal
{
    public void run()
    {
        System.out.println("This a animal method");
    }
}
class Dog extends Aanimal
{
    public void run()
    {
        super.run();
        System.out.println("This is a dog class");
    }
}
public class DemoExample {
    public static void main(String[] args) {
        Aanimal a = new Dog();
        a.run();
    }
}
