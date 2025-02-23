import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int sum1 = 0, sum2 = 0;
        System.out.println("Enter the elements of the matrix1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        //calculation
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum1 = sum1 + a[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum2 = sum2 + b[i][j];
            }
        }
        if(sum1==sum2)
        {
            System.out.println("The sum is equal");
        }
        else
        {
            System.out.println("The sum is not equal");
        }
    }
}

