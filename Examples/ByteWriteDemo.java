package Examples;
import java.io.*;
public class ByteWriteDemo {
    public static void main(String[] args) {
        try
        {
            FileOutputStream fo = new FileOutputStream("hi.txt",true);
            fo.write(65);
            fo.flush();
            fo.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
