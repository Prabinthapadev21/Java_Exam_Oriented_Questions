class Calculation
{
    public int  addition(int a,int b,int c)
    {
        return a+b+c;
    }
    public int  addition(int a,int b)
    {
        return a+b;
    }
}
public class MethodOverloadingConcept {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        System.out.println("Sum = "+ c.addition(1,2,3));
        System.out.println("Sum ="+ c.addition(1,2));
    }
}
