package FileHandeling;
import java.io.FileWriter;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number");
        int num = sc.nextInt();
        try
        {
            FileWriter fw1 = new FileWriter("prime.txt");
            FileWriter fw2 = new FileWriter("composite.txt");
            for(int i =1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                fw1.write(num+"\n");
                System.out.println(num+"is a prime number");
            }
            else
            {
                fw2.write(num+"\n");
                System.out.println(num+"is a composite number");
            }
            fw1.close();
            fw2.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
