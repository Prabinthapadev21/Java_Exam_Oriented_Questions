package PracticeQuestions;
import java.util.Scanner;
//Write a Java program to calculate the factorial of a number using a while loop.
class Factorial{
    public void factorial(int num)
    {
        int fact=1;
        int i = 1;
        while (i<=num)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial is "+fact);
    }
}
public class QuestionSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial:");
        int num = sc.nextInt();

        Factorial f = new Factorial();
        f.factorial(num);
    }
}
