import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial:");
        int num=sc.nextInt();
        display(num);
    }
    public static void display(int num)
    {
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of "+num +" is "+fact);
    }
}