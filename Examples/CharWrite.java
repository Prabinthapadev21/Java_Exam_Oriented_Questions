package Examples;

import java.io.FileWriter;
import java.io.IOException;

public class CharWrite
{
    public static void main(String[] args) {
        try
        {
            FileWriter fw = new FileWriter("ff.txt");
            fw.write(65);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
