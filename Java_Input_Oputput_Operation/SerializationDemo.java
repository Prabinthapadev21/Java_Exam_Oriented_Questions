package Java_Input_Oputput_Operation;
import java.io.*;
import java.io.Serializable;

//Serialization is the process of converting a Java object into a byte stream.
//so that it can be saved to a file, sent over a network, or stored in a database.
class Collage implements Serializable
{
    String name;
    public Collage(String name)
    {
        this.name=name;
    }

}
public class SerializationDemo {
    public static void main(String[] args) {
        try
        {
            Collage c = new Collage("Lumbini");
            FileOutputStream fo = new FileOutputStream("abc.txt");
            ObjectOutputStream o = new ObjectOutputStream(fo);
            o.writeObject(c);
            o.flush();
            o.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
