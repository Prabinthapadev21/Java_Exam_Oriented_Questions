package Final_Examination.set_1;
import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("hllo.txt");
            fw.write("Hi i am prabin thapa");
            fw.flush();
            fw.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
