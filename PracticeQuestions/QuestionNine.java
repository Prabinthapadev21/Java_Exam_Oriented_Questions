package PracticeQuestions;
import java.util.Scanner;
//Write a Java program to check if a given number is prime using a for loop.
class PrimeNumber{
    public void primeNumber(int num)
    {
        int c=0;
        for(int i = 1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==2) System.out.println("The entered number is prime");
        else System.out.println("The entered number is not prime");
    }
}
public class QuestionNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        PrimeNumber p = new PrimeNumber();
        p.primeNumber(num);
    }
}
