package PracticeQuestions;
//Write a Java program to print the first 10 natural numbers using a for loop.
import java.util.Scanner;
class NaturalNumber{
    public void naturalNumber()
    {
        for (int i = 1;i<=10;i++)
        {
            System.out.println("i = "+i);
        }
    }
}
public class QuestionSix {
    public static void main(String[] args) {
        NaturalNumber n = new NaturalNumber();
        n.naturalNumber();
    }
}
