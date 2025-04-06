package Examples;

import java.io.FileInputStream;

public class ByteReadDemo {
    public static void main(String[] args) {
        try
        {
            FileInputStream fi = new FileInputStream("hi.txt");
            int i  = fi.read();
            System.out.println((char)i);
            fi.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
