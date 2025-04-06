package Examples;

import java.io.FileWriter;

public class CharArrayWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Write.txt",true);
            char ch[]={'h','i','i','o'};
            fw.write(ch);
            fw.flush();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
