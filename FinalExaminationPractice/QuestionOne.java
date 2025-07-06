package FinalExaminationPractice;
//What is constructor and what are the thype of constructor and give an example of constructor.
//Constructor is a special type of method which is used ti initialize the object.There are two type of constructor::
// Parameterized constructor
//2.Non-parameterized constructor
class ConstructorDemo{
    int a;
    int b;
    public ConstructorDemo(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        System.out.println("The sum is "+(a+b));
    }
}
public class QuestionOne {
    public static void main(String[] args) {
        ConstructorDemo d = new ConstructorDemo(3,4);
        d.add();
    }
}
