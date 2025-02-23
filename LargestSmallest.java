import java.util.Scanner;
public class LargestSmallest {
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
        int max=a[0];
        int min=a[0];
        for(int i=0;i<num;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
             if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("The max value in the array is "+max);
        System.out.println("The minimum value in the array is "+min);
    }
}