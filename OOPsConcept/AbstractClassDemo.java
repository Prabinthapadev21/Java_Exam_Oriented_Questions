package OOPsConcept;
abstract class Teacher
{
    public void display()
    {
        System.out.println("Teacher can teach");
    }
    abstract void role();
}
class Student extends Teacher{
    void role()
    {
        System.out.println("Student can study");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Teacher t = new Student();
        t.display();// calls concrete method from Teacher
        t.role();//calls implemented abstract method in Stuudent
    }
}
