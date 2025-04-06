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
        Student s = new Student();
        s.display();// calls concrete method from Teacher
        s.role();//calls implemented abstract method in Stuudent
    }
}
