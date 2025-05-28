package OOPsConcept;

import java.util.Scanner;

// java doesnot supports multiple inheritence but by using the interface we can achieve multiple inheritence in java.
class Multiplication
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int m = sc.nextInt();
        System.out.println("Enter the size of column");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.println("Enter the element of frst matrix");
        for (int i = 0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the element of 2nd matrix");
        for (int i = 0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }

//        logic for the multiplication of the matrix.
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                for (int k =0;k<m;k++)
                {
                    c[i][j]+= a[i][k]*b[k][j];
                }
            }
        }

//        displaying the output
        for (int i =0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}