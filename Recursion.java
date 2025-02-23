import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 1st number");
        int num= sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();
        System.out.println("The sum is "+sum(num));
        System.out.println("The sum is "+sum(num,num2));
    }
    public static int sum(int num)
    {
        if(num>0)
        {
            return num+sum(num-1);
        }
        else
        {
           return 0;
        }
    }
    public static int sum(int num,int num2)
    {
        if(num>5)
        {
            return num+sum(num,num2-1);
        }
        else
        {
            return 0;
        }
    }
}
