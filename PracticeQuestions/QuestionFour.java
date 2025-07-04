package PracticeQuestions;
//Write a Java program to print the day of the week using a switch statement.
import java.util.Scanner;
class DisplayWeeks{
    public void weekDisplay(int num)
    {
        switch (num)
        {
            case 1:
                System.out.println("Sunday");break;case 2:
                System.out.println("Monday");break;case 3:
                System.out.println("Tuesday");break;case 4:
                System.out.println("Wednesday");break;case 5:
                System.out.println("Thursday");break;case 6:
                System.out.println("Friday");break;case 7:
                System.out.println("Saturday");break;
            default:
                System.out.println("Please enter the correct option");
        }
    }
}
public class QuestionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the options from 1-7");
        int num = sc.nextInt();

        DisplayWeeks d = new DisplayWeeks();
        d.weekDisplay(num);
    }
}
