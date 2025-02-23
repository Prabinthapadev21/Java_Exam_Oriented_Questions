import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        display(num);
    }
    public static void display(int num)
    {
        int temp,rem,pali=0;
        temp=num;
        while(num!=0)
        {
            rem=num%10;
            pali=rem+(pali*10);
            num=num/10;
        }
        if(temp==pali)
        {
            System.out.println("The number is palindrome..");
        }
        else
        {
            System.out.println("The number is not palindrome...");
        }
    }
}