import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking the Seasons by entering the months*****************");

        while (true) {
            System.out.println("Checking the Seasons in both Northern and Southern Hemisphere..");
            System.out.println("1. Northern Hemisphere\n2. Southern Hemisphere\n3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the month name to check the season: ");
                    String month1 = sc.nextLine().trim().intern(); // Intern the string
                    northern(month1);
                    break;
                case 2:
                    System.out.print("Enter the month name to check the season: ");
                    String month2 = sc.nextLine().trim().intern(); // Intern the string
                    southern(month2);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }

    public static void northern(String month1) {
        if (month1 == "December" || month1 == "January" || month1 == "February") {
            System.out.println("It's Winter Season.");
        } else if (month1 == "March" || month1 == "April" || month1 == "May") {
            System.out.println("It's Spring Season.");
        } else if (month1 == "June" || month1 == "July" || month1 == "August") {
            System.out.println("It's Summer Season.");
        } else if (month1 == "September" || month1 == "October" || month1 == "November") {
            System.out.println("It's Autumn (Fall) Season.");
        } else {
            System.out.println("Invalid month name. Please enter a valid month.");
        }
    }

    public static void southern(String month2) {
        if (month2 == "December" || month2 == "January" || month2 == "February") {
            System.out.println("It's Summer Season.");
        } else if (month2 == "March" || month2 == "April" || month2 == "May") {
            System.out.println("It's Autumn (Fall) Season.");
        } else if (month2 == "June" || month2 == "July" || month2 == "August") {
            System.out.println("It's Winter Season.");
        } else if (month2 == "September" || month2 == "October" || month2 == "November") {
            System.out.println("It's Spring Season.");
        } else {
            System.out.println("Invalid month name. Please enter a valid month.");
        }
    }
}
