package FileHandeling;
import java.io.*;
public class ByteArrayWrite {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/prabinthapa/Desktop/ByteWrite.txt",true);
            String s = "Lumbini ICT Campus";
            byte b[]= s.getBytes();
            fos.write(b);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
