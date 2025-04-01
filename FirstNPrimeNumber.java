import java.util.Scanner;
public class FirstNPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number for prime number:");
        int num = sc.nextInt();
        System.out.println("The prime numbers are ");
        findprimeno(num);
    }
    public static void findprimeno(int num)
    {
        for (int i =1;i<num;i++)
        {
            int count = 0;
            for (int j= 1; j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i);
            }
        }
    }
}
