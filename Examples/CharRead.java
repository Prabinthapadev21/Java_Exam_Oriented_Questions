package Examples;

import java.io.FileReader;
import java.io.IOException;

public class CharRead {
    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("ff.txt");
            int i = fr.read();
            System.out.println((char) i);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
