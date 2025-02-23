class ShowRoom{
    String model;
    int price;
    String name;

    public ShowRoom(String model,int price,String name)
    {
        this.model=model;
        this.price=price;
        this.name=name;
    }
    public void display()
    {
        if(price>200000 && model=="Lamborghini")
        {
            System.out.println("Company = "+model +" price = "+price +" Car "+name);
        }
    }
}
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        ShowRoom s1 = new ShowRoom("BMW",160000,"Luxury crossover SUV");
        ShowRoom s2 = new ShowRoom("Lamborghini",260000,"lamborghini huracan");
        s1.display();
        s2.display();
    }
}
