package OOPsConcept;
// java doesnot supports multiple inheritence but by using the interface we can achieve multiple inheritence in java.
class Demo
{
    public void display()
    {
        System.out.println("hi this is a parent Class");
    }
}
class Demo2 extends Demo
{
    public void show()
    {
        System.out.println("This is a child class");
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.show();
        d.display();
    }
}