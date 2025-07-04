package PracticeQuestions;
//Write a Java program to print numbers from 1 to 100, but skip multiples of 5 using
//the continue statement.
class NumbersPrint{
    public void printNumbers()
    {
        for (int i = 1;i<=100;i++)
        {
            if(i%5==0)
            {
                continue;
            }
            System.out.println("i ="+i);
        }
    }
}
public class QuestionTen {
    public static void main(String[] args) {

        NumbersPrint np = new NumbersPrint();
        np.printNumbers();
    }
}
