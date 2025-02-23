import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(100)");
        int num=sc.nextInt();
        display(num);
    }
    public static void display(int num)
    {
        System.out.println("The numbers except the multiple of 5 are");
        for(int i=1;i<=num;i++)
        {
            if(i%5==0)
            {
                continue;
            }
            else
            {
                System.out.println(i+" ");
            }
        }
    }
}
