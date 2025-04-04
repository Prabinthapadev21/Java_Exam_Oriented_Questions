class Camel {
    int legs;
    int eyes;
    int ears;

    public Camel(int legs, int eyes, int ears) {
        this.legs = legs;
        this.eyes = eyes;
        this.ears = ears;
    }

    public void display() {
        System.out.println("Legs: " + legs + ", Eyes: " + eyes + ", Ears: " + ears);
    }
}

class InheritenceDemo extends Camel{

    public InheritenceDemo() {
        // Call parent class constructor using super
        super(4, 2, 2);
    }

    public void show() {
        display(); // We can use parent class method directly
    }

    public static void main(String[] args) {
        InterfaceDemo d = new InterfaceDemo();
        d.show();
    }
}
