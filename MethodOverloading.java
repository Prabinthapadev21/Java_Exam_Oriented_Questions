import java.util.Scanner;
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();
        MethodOverloading mo = new MethodOverloading();
        mo.sum();
        mo.sum(num1,num2);
        mo.sum(num1,num2,num3);
    }
    public void sum(int num1,int num2)
    {
        int sum =num1+num2;
        System.out.println("Sum is "+sum);
    }
    public void sum(int num1,int num2,int num3)
    {
        int sum = num1+num2+num3;
        System.out.println("Sum is "+sum);
    }
    public void sum()
    {
        int num1=5,num2=6;
        int sum =num1+num2;
        System.out.println("Sum is "+sum);
    }
}
