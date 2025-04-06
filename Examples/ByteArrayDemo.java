package Examples;

import java.io.FileOutputStream;

public class ByteArrayDemo {
    public static void main(String[] args) {
        try
        {

            FileOutputStream fi = new FileOutputStream("hello.txt",true);
            String  s ="Hello World";
            byte b[]= s.getBytes(s);
            fi.write(b);
            fi.flush();
            fi.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
