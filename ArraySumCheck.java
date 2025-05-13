import java.util.Scanner;

public class ArraySumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array
        System.out.print("Enter number of elements in first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.print("Enter number of elements in second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Calculate sums
        int sum1 = 0, sum2 = 0;
        for (int num : arr1) sum1 += num;
        for (int num : arr2) sum2 += num;

        // Compare and display result
        if (sum1 == sum2) {
            System.out.println("The sum of both arrays is equal.");
        } else {
            System.out.println("The sum of both arrays is not equal.");
        }

        scanner.close();
    }
}
