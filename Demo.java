class Brand{
    String company;
    int price;
    static String name;
    public void display()
    {
        System.out.println("Brand = "+company +" Price = "+price +"Name = "+name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Brand c= new Brand();
        c.company="Apple";
        c.price=12500;
        Brand.name="Mac Os";
        Brand.name = "Hello";
        c.display();
    }
}
