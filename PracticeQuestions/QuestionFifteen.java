package PracticeQuestions;
//Write a Java program to implement a menu-driven calculator using a switch statement.
import java.util.Scanner;
class Calculator{
    public void calculation(int choice,int a,int b)
    {
        switch (choice)
        {
            case 1:
                System.out.println("Sum = "+(a+b));
                break;case 2:
                System.out.println("Sub = "+(a-b));
                break;case 3:
                System.out.println("Mul = "+(a*b));
                break;case 4:
                System.out.println("Div = "+(a/b));
                break;case 5:
                System.out.println("Mod = "+(a%b));
                break;
            default:
                System.out.println("Please enter the correct option");
        }
    }
}
public class QuestionFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the following choice:");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.println("5.Mod");
        int choice = sc.nextInt();



        Calculator c = new Calculator();
        c.calculation(choice,a,b);
    }
}
