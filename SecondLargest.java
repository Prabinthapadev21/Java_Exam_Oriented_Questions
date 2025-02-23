import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
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
        int max=a[1];
        int max2=a[0];
        for(int i=0;i<num;i++)
        {
            if(max<a[i])
            {
                max2=max;
                max=a[i];
            }
            else if(max>max2 && a[i]>max2)
            {
                max2=a[i];
            }
        }
        System.out.println("The second largest number is "+max2);
    }
}
