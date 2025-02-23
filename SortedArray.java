import java.util.Scanner;
public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int a[] = new int[num];
        int b[] = new int[num];
        System.out.println("Enter the elements of the 1st array:");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array");
        for (int i = 0; i < num; i++) {
            b[i] = sc.nextInt();
        }
        operation(a,num);
        operation(b,num);
        display(a,b,num);
    }

    public static void operation(int arr[], int num) {
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void display(int a[], int b[], int num) {
        int n=num*2;
        int c[]=new int[n];
        int count=0;
        for (int i = 0; i < num; i++) {
            c[count++] = a[i];
        }
        for (int i = 0; i < num; i++) {
            c[count++] = b[i];
        }
        // now sorting the merged array
        operation(c,n);
        System.out.println("The sorted and merged array is ");
        for (int i = 0; i <n; i++)
        {
            System.out.println(c[i]+" ");
        }
    }
}