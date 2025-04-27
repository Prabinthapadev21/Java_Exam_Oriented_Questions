class Distance
{
    private int feet;
    private int inches;

    public Distance(int feet,int inches)
    {
        this.feet=feet;
        this.inches=inches;
    }
    public int addDistance()
    {
        return feet+inches;
    }
    public int  subDistance()
    {
        return feet-inches;
    }
    public void displayDistance()
    {
        System.out.println("The added distance is "+addDistance());
        System.out.println("The subtracted distance is "+subDistance());
    }
}
public class MyDistance {
    public static void main(String[] args) {
        Distance d = new Distance(5,3);
        d.displayDistance();
    }
}
