package PracticeQuestions;
//Write a Java program to check whether a given number is even or odd using if-else.
import java.util.Scanner;
class EvenOdd
{
    public void oddeven(int num)
    {
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
public class QuestionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        EvenOdd e = new EvenOdd();
        e.oddeven(num);
    }
}
