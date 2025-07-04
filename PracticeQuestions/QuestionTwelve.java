package PracticeQuestions;
//Write a Java program to check whether a number is a palindrome or not using
//a while loop.
import java.util.Scanner;
class PalindromeChecker{
    public void palindromeCheck(int num) {
        int rem, rev = 0;
        int pali = num;
        while (num != 0) {
            rem = num%10;
            rev = rem +(rev*10);
            num=num/10;
        }
        if(rev==pali)
        {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not pallindrome");
        }
    }
}
public class QuestionTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        PalindromeChecker pc = new PalindromeChecker();
        pc.palindromeCheck(num);
    }
}
