interface Printable{
    void print();
}
interface Showable{
    void show();
}
public class InterfaceDemo implements Printable,Showable {
    public void print()
    {
        System.out.println("Printing");
    }
    public void show()
    {
        System.out.println("Showing");
    }

    public static void main(String[] args) {
        InterfaceDemo d = new InterfaceDemo();
        d.print();
        d.show();
    }
}