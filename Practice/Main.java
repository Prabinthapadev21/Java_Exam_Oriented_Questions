package Practice;

class Student {
    String name;
    int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
    }
    }
public class Main{
    public static void main(String[] args) {
        Student obj = new Student("abin",23);
        obj.display();
    }
    }
