package FileHandeling;
import java.io.*;
public class CharacterWrite {
    public static void main(String[] args) {
        try
        {
            FileWriter fw = new FileWriter("/Users/prabinthapa/Desktop/ByteWrite.txt",true);
            fw.write(65);
            char []ch = {'r','u','n','n','i','n','g'};
            fw.write(ch);
            String s = "cat";
            fw.write(s);
            fw.flush();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
