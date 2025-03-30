package FileHandeling;
import java.io.*;
public class ByteWrite {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("/Users/prabinthapa/Desktop/ByteWrite.txt",true);
            fos.write(65);
            fos.flush();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}