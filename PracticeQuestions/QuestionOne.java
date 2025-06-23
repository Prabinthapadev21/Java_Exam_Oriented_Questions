package PracticeQuestions;
//Write a Java program to check whether a given number is positive, negative, or zero
//using if-else.
import java.util.Scanner;
public class QuestionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num<0)
        {
            System.out.println("Number is negative");
        }
        else if(num==0)
        {
            System.out.println("Number is Zero");
        }
        else {
            System.out.println("Number is positive");
        }
    }
}
