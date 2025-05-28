package Practice;
class Addition
{
    public void add(int a,int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
    public void add(int a,int b,int c)
    {
        int sum = a+b+c;
        System.out.println(sum);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(3,4);
        a.add(4,5,6);
    }
}
