package OOPsConcept;
interface Hi
{
    abstract void display();
}
interface Hello
{
    abstract void show();
}
public class InterfaceDemo implements Hi,Hello{
    public void display()
    {
        System.out.println("Hi World");
    }
   public void show()
    {
        System.out.println("Hello Wolrd");
    }

    public static void main(String[] args) {
        InterfaceDemo i = new InterfaceDemo();
        i.display();
        i.show();
    }
}
