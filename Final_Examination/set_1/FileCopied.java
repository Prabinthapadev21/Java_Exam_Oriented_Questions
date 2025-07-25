package Final_Examination.set_1;
import java.io.*;

public class FileCopied {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("hllo.txt");
            FileWriter fw = new FileWriter("hiii.txt");

            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }

            // Close the streams
            fr.close();
            fw.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
