package StringFunction;
import java.util.Scanner;
import java.io.*;
public class VowelConconent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        try
        {
            FileWriter fw1 = new FileWriter("vowel.txt");
            FileWriter fw2 = new FileWriter("Conconetnt.txt");
            for (int i =0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')
                {
                    fw1.write(ch);
                }
                else
                {
                    fw2.write(ch);
                }
            }
            fw1.flush();
            fw1.close();
            fw2.flush();
            fw2.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
