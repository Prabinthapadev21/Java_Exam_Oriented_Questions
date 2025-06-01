package Practice;
class Distance
{
    private int feet;
    private int inches;
     public Distance(int feet,int inches)
    {
        this.feet=feet;
        this.inches=inches;
    }
    public int  addDistance()
    {
        return feet+inches;
    }
    public int subtractDistance()
    {
        return  feet-inches;
    }
    public void displayDistance()
    {
        System.out.println("The sub is "+subtractDistance());
        System.out.println("The add is "+addDistance());
    }
}
public class MyDistance {
    public static void main(String[] args) {
        Distance d = new Distance(4,6);
        d.displayDistance();
    }
}
