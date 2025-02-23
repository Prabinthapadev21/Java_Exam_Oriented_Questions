import java.util.Scanner;
public class NewExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=sc.nextInt();
        int a[]=new int[num];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num;i++)
        {
            a[i]=sc.nextInt();
        }
        duplicate(a,num);
    }
    public static void duplicate(int arr[],int num)
    {
        int count=0;
        int b[]=new int[num];
        for(int i=0;i<num;i++)
        {
            int j;
            for( j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    break;
                }
            }
                if(i==j)
                {
                    b[count]=arr[i];
                    count++;
                }
        }
        System.out.println("The non duplicate array is");
        for(int i=0;i<count;i++)
        {
            System.out.println(b[i]+" ");
        }
    }
}
