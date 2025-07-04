package PracticeQuestions;
//Write a Java program to display &quot;Pass&quot; if a student&#39;s marks are 40 or more; otherwise
//display &quot;Fail&quot;.
import java.util.Scanner;
class MarksCheck{
    public void marksCheck(int marks)
    {
        if(marks>=40)
        {
            System.out.println("Hurray! you passed the exam");
        }
        else {
            System.out.println("Sorry! you got failed in the exam");
        }
    }
}
public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student:");
        int marks = sc.nextInt();

        MarksCheck m = new MarksCheck();
        m.marksCheck(marks);
    }
}
