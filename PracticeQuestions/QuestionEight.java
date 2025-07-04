package PracticeQuestions;
import java.util.Scanner;
//Write a Java program to reverse a given number using a while loop.
class ReverseNumber {
    public void reverseNumber(int num){
        int rem,rev=0;
        while(num!=0)
        {
            rem = num%10;
            rev = rem+(rev*10);
            num = num/10;
        }
        System.out.println("The reverse of number is "+rev);
    }
}
public class QuestionEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        ReverseNumber rn = new ReverseNumber();
        rn.reverseNumber(num);
    }
}
