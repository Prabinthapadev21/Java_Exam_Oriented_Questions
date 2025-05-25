package OOPsConcept;
 abstract class HiDemo
{
    public void display()
    {
        System.out.println("This is a concrete method");
    }
    abstract void show();
}
class HelloDisplay extends HiDemo
{
    void show()
    {
        System.out.println("Hi this is a abstract method");
    }
}
public class DemoExample {
    public static void main(String[] args) {
        HiDemo d = new HelloDisplay();
        d.display();
        d.show();
    }
}
