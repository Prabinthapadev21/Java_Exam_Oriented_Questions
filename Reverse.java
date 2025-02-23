import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        display(num);
    }
    public static void display(int num)
    {
        int rem,rev=0;
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev = rem+(rev*10);
            num=num/10;
        }
        System.out.println("The reverse of "+temp+ " is "+rev);
    }
}
