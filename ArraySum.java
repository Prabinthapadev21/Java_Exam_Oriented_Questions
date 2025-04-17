import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int a[] = new int[num];
        int b[] = new int[num];
        System.out.println("Enter the elements of the 1st array:");
        for (int i =0;i<num;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array:");
        for (int i =0;i<num;i++)
        {
            b[i]=sc.nextInt();
        }
        sum(a,b,num);
    }
    public static void sum(int a[],int b[],int num)
    {
        int sum1=0,sum2=0;
        for (int i =0;i<num;i++)
        {
            sum1= sum1+a[i];
            sum2= sum2+b[i];
        }
        if(sum1==sum2)
        {
            System.out.println("Two array are equal");
        }
        else
        {
            System.out.println("Two array are not equal");
        }
    }
}
