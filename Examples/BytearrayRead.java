package Examples;

import java.io.FileInputStream;

public class BytearrayRead {
    public static void main(String[] args) {
        try
        {
            FileInputStream fi = new FileInputStream("Hello.txt");
            int i;
            while ((i=fi.read())!=-1)
            {
                System.out.println((char)i);
            }
            fi.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
