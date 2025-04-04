public class ParametrrizedConstructor {
    String s;
    public ParametrrizedConstructor(String s)
    {
        this.s=s;
    }
    public void display()
    {
        System.out.println("Name = "+s);
    }

    public static void main(String[] args) {
        ParametrrizedConstructor p = new ParametrrizedConstructor("Prabin");
        p.display();
    }
}
