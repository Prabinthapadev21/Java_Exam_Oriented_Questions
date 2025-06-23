package PracticeQuestions;
import java.util.Scanner;
//Write a Java program to find the greatest of three numbers using if-else.
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The greatest number is "+greatest(num1,num2,num3));
    }
    public static int greatest(int num1,int num2,int num3)
    {
        if(num1>num2 && num1>num3)
        {
            return num1;
        }
        else if(num2>num1 && num2>num3)
        {
            return num2;
        }
        else
        {
            return num3;
        }
    }
}
