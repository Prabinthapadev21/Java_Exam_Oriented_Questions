package Stastatics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CorellationCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the numbers of x");
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Enter the numbers of y");
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

    }
}
