import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the Student:");
        int marks = sc.nextInt();
        display(marks);
    }
    public static void display(int marks)
    {
        if(marks>=40)
        {
            System.out.println("Student got passed in Exam...");

        }
        else
        {
            System.out.println("Student got failed in the Exam....");
        }
    }
}