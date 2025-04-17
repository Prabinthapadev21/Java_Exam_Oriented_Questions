import java.util.Scanner;
public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num = sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements of the array");
        for (int i =0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The sorted array are:");
        ascending(arr,num);
    }
    public static void ascending(int arr[],int num)
    {
        for (int i =0;i<num-1;i++)
        {
            for (int j=i+1;j<num;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i =0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
