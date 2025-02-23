import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        display(num);
    }
    public static void display(int num)
    {
        int rem,sum=0;
        while (num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("The sum of the element is "+sum);
    }
}