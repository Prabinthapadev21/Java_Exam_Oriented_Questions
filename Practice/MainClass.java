package Practice;

class Animal {
    void move() {
        System.out.println("Animal is running");
    }
}

class Cat extends Animal {
    @Override
    void move() {
        System.out.println("Cat is walking");
    }
}

class Fish extends Animal {
    @Override
    void move() {
        System.out.println("Fish is swimming");
    }
}

// Only this class is public — match the filename to this
public class MainClass {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal c = new Cat();//polomorism co
        Animal f= new Fish();

        a.move();
        c.move();
        f.move();
    }
}
