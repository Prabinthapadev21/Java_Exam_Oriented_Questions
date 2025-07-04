package PracticeQuestions;
//Write a Java program to display a pattern like the following using nested loops:
//*
//**
//***
//****
//*****
import java.util.Scanner;
public class QuestionFourteen {
    public static void main(String[] args) {
        for (int i =1;i<=5;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
