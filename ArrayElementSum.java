import java.util.Scanner;
public class ArrayElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num=sc.nextInt();
        int a[]=new int[num];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num;i++)
        {
            a[i]=sc.nextInt();
        }
        display(a,num);
    }
    public static void display(int a[],int num)
    {
        int sum=0;
        for(int i=0;i<num;i++)
        {
            sum+=a[i];
        }
        System.out.println("The sum of the elements of the array is "+sum);
    }
}
