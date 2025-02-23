//constructor in java
class Computer{
    String device;
    int price;
    public Computer(String device,int price)
    {
        this.device=device;
        this.price=price;
    }
    public void display()
    {
        System.out.println("The Operating system is "+device);
        System.out.println("The price is $"+price);
    }
}



class Object {
     public static void main(String[] args) {
         Computer c = new Computer("MAC 0S",1000);
         c.display();
     }
}
