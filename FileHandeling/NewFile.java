package FileHandeling;
import java.io.*;
import java.util.Scanner;
public class NewFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number =sc.nextInt();
        try{
            FileWriter fw = new FileWriter("hello.txt");
            fw.write(number);
            fw.flush();
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
