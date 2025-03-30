package FileHandeling;
import java.io.*;
public class ByteArrayRead {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("/Users/prabinthapa/Desktop/ByteWrite.txt");
            int i;
            while( (i=fis.read())!=-1)
            {
                System.out.println((char)i);
            }
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
