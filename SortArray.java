import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort array in ascending order
        Arrays.sort(arr);

        // Output sorted array
        System.out.println("The sorted array are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
