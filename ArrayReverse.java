import java.util.Scanner;
public class ArrayReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num= sc.nextInt();
        int a[]=new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<num;i++)
        {
            a[i]=sc.nextInt();
        }
        display(a,num);
    }
    public static void display(int a[],int num)
    {
        System.out.println("The reversed array is ");
        for(int i=num-1;i>=0;i--)
        {
            System.out.println( a[i]+" ");
        }
    }

    }