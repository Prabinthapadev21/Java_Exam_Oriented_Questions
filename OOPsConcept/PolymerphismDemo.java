package OOPsConcept;
class A
{
    public void display()
    {
        System.out.println("Hello from class A");
    }
}
class B extends A
{
    public void display()
    {
        super.display();
        System.out.println("Hello from class B");
    }
}
public class PolymerphismDemo {
    public static void main(String[] args) {
        A a = new B();
        a.display();
    }
}
