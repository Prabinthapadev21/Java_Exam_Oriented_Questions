package Practice;
import java.io.*;
public class CharacterWrite {
    public static void main(String[] args) {
        try
        {
            FileWriter fw = new FileWriter("xyz.txt");
            fw.write(65);
            char ch[] ={'p','r','s','b','i','n'};
            fw.write(ch);
            String name = "Prabin";
            fw.write(name);
            fw.flush();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
