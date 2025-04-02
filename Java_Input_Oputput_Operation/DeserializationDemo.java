package Java_Input_Oputput_Operation;
import java.io.*;
//Deserialization is the process of converting a byte stream back into an object.
//his is the reverse of serialization and is used to recreate the object from its serialized form.
public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("abc.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Reading object from file
            Collage c = (Collage) oi.readObject();
            oi.close();

            System.out.println("Deserialized Collage Name: " + c.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
