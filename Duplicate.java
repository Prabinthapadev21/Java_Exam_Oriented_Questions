import java.util.Scanner;
public class Duplicate {
    public static final int num=10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[num];
        int b[]=new int[num];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        delete(a,b);
    }
    public static void delete(int a[],int b[])
    {
        int count=0,ncount=0;
        for(int i=0;i<num-1;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(a[i]!=a[j])
                {
                    b[ncount]=a[i];
                    ncount++;
                }
                else {
                    count++;
                }
            }
        }
        //removed duplicate element from the array
        System.out.println("The non duplicate elements of the array are:");
        for(int i=0;i<ncount;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println("The no of duplicate elements in the are "+count);
    }
}
