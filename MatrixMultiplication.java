import java.util.Scanner;
public class MatrixMultiplication {
    public static final int row = 3;
    public static final int col = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        System.out.println("Enter the elements of the 1st matrix:");
        for (int i = 0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2nd matrix:");
        for (int i = 0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("The multiplication of the matrix is:");
        matrixmultiplication(a,b);
    }
    public static void matrixmultiplication(int a[][],int b[][])
    {
        int c[][] = new int[row][col];
        //now calculating the multiplication if the 2 matrix of size 3*3
        for (int i = 0 ;i<row ;i++)
        {
            for (int j =0 ;j<col ; j++)
            {
                for (int k =0;k<row ;k++)
                {
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        //now displaying the resultant matrix
        for (int i =0;i<row;i++)
        {
            for (int j =0;j<col;j++)
            {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
