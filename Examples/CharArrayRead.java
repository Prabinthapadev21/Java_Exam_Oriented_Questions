package Examples;

import java.io.FileReader;

public class CharArrayRead {
    public static void main(String[] args) {
        try
        {
            FileReader fw = new FileReader("Write.txt");
            int i;
            while((i=fw.read())!=-1)
            {
                System.out.println((char) i);
            }
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
