package Java_Input_Oputput_Operation;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        try
        {
            FileWriter fw1 = new FileWriter("consonent.txt");
            FileWriter fw2 = new FileWriter("vowel.txt");
            for(int i=0;i<s.length();i++)
            {
                char ch = Character.toLowerCase(s.charAt(i));
                if(ch=='a' || ch=='e'|| ch=='i'|| ch=='0'|| ch=='u')
                {
                    fw2.write(ch);
                }
                else {
                    fw1.write(ch);
                }
            }
            fw1.close();
            fw2.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        sc.close();
    }

}
