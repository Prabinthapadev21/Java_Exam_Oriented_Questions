import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= sc.nextInt();
        display(num);
    }
    public static void display(int num)
    {
        System.out.println("The natural numbers are ");
        for(int i=1;i<=num;i++)
        {
            System.out.print(i+" ");
        }
    }
}