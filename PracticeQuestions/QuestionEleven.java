package PracticeQuestions;
import java.util.Scanner;
//Write a Java program to print the Fibonacci series up to n terms using a for loop.
class FibonacciSeries{
    public int fibonacciNumbers(int num)
    {
        if(num==0){
            return 0;
        } else if (num==1) {
            return 1;
        }
        else {
            return fibonacciNumbers(num - 1) + fibonacciNumbers(num - 2);
        }
    }
}
public class QuestionEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series:");
        int num = sc.nextInt();

        FibonacciSeries f = new FibonacciSeries();
        for (int i = 0;i<num;i++)
        {
            System.out.println("number = "+f.fibonacciNumbers(i));
        }
    }
}
