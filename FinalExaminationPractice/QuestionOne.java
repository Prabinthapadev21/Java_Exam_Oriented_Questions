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

// we can use instance variable also instead of constructor but constructor helps to initialize the object dynamically when
//the object is created and we can pass different values for the different object but the instance value is fixed.