package OOPsConcept;
class Parent
{
    public void display()
    {
        System.out.println("This is parent");
    }
}
class ChildOne extends Parent
{
    @Override
    public void display() {
        System.out.println("This is childOne");
    }
}
class ChildTwo extends Parent{
    @Override
    public void display() {
        System.out.println("This is ChildTwo");
    }
}
public class DynamicMemoryDispatch {
    public static void main(String[] args) {
        Parent p = new Parent();
        ChildOne c1 = new ChildOne();
        ChildTwo c2 = new ChildTwo();

        Parent r;
        r = p;
        r.display();
        r=c1;
        r.display();
        r=c2;
        r.display();
    }
}
