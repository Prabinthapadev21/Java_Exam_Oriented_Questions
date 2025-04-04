class Animal
{
    String name="Animal";
    void display()
    {
        System.out.println("I am a Animal");
    }
}
class Dog extends Animal
{
    String name ="Dog";
    void ShowNames()
    {
        System.out.println("Child class name:"+this.name);
        System.out.println("Parent class name:"+super.name);
    }
    void display()
    {
        super.display();
        System.out.println("I am a dog");
    }
}
public class ThisSuperKeywordExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.ShowNames();
        d.display();
    }
}
