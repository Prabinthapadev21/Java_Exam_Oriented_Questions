import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        System.out.println("Enter the elements of the 1st array");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array");
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            c[i]=a[i];
            count++;
        }
        for(int j=0;j<5;j++)
        {
            c[count]=b[j];
            count++;
        }
        for(int i=0;i<count;i++)
        {
            System.out.println(c[i]+" ");
        }
    }
}
