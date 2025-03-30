package FileHandeling;
import java.io.*;
public class ByteRead {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("/Users/prabinthapa/Desktop/ByteWrite.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
