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
            int choice = sc.nextInt();
            sc.nextInt();
            switch (choice)
            {
                case 1:
                    createNote(scanner);
                    break;
                case 2:
                    readNote();
                    break;
                case 3:
                    appendNote(scanner);
                    break;
                case 4:
                    deleteNote();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    // create a new note
    public static void createNote(Scanner scanner)
    {
        try(FileWriter writer = new FileWriter(File_Path))
        {
            System.out.println("Enter your note :");
            String note = scanner.nextLine();
            writer.write(note);
            System.out.println("Note saved successfully");
        }
        catch (IOException e)
        {
            System.out.println("Error creating note.");
            e.printStackTrace();
        }
    }

}
