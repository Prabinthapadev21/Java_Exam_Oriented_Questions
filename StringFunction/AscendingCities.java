package StringFunction;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingCities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[5];
        System.out.println("Enter the five cities name:");
        for (int i =0;i<5;i++)
        {
            s[i] = sc.nextLine();
        }
        Arrays.sort(s);
        System.out.println("Printing the cities in ascending order:");
        for(String name:s)
        {
            System.out.println(name);
        }
    }
}
