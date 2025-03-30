package FileHandelingPraoject;
import java.io.*;
import java.util.Scanner;
public class NoteManager {
    static final String File_Path = System.getProperty("user.home") +"/Desktop/notes.txt";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n📌 Simple Note Manager 📌");
            System.out.println("1. Create Note");
            System.out.println("2. Read Note");
            System.out.println("3. Append to Note");
            System.out.println("4. Delete Note");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
        }
    }
}
