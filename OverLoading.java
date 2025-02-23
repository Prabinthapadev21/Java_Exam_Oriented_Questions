public class OverLoading {
    public static void main(String[] args) {
        int a = 5,b=6,c=10;
        OverLoading o = new OverLoading();
        o.add(a,b);
        o.add(a,b,c);
        o.add();
    }
    public void add(int a,int b)
    {
        int r = a+b;
        System.out.println("Sum is "+r);
    }
    public void add(int a,int b,int c)
    {
        int r = a+b+c;
        System.out.println("Sum is "+r);
    }
    public void add()
    {
        int a=5,b=6;
        int c = a+b;
        System.out.println("Sum is "+c);
    }
}
