package PracticeQuestions;
//Write a Java program to find the sum of digits of a number using a while loop.
import java.util.Scanner;
class SumOfDigits{
    public void sum0fDigits(int num)
    {
        int rem,sum=0;
        while (num!=0)
        {
            rem = num%10;
            sum = sum+rem;
            num=num/10;
        }
        System.out.println("The sum of the digits is "+sum);
    }
}
public class QuestionThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        SumOfDigits s = new SumOfDigits();
        s.sum0fDigits(num);
    }
}
