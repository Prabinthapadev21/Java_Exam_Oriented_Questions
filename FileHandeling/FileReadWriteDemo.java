package FileHandeling;
import java.io.*;
public class FileReadWriteDemo {
    public static void main(String[] args) {
        try
        {
            FileReader fr = new FileReader("vowel.txt");
            FileWriter fw = new FileWriter("hello.txt");
            int c;
            while((c=fr.read())!=-1)
            {
                fw.write(c);
            }
            fr.close();
            fw.close();
            System.out.println("Succesfully copied the content");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
