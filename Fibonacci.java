import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("The fibonacci series are");
        for (int i = 0; i < num; i++)
        {
            System.out.println( display(i)+" ");
        }
    }
    public static int display(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else
        {
            return display(num-1)+display(num-2);
        }
    }
}
