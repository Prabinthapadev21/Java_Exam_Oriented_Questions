import java.util.Scanner;
public class CallByValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        swap(num1,num2);
        System.out.println("The swaped value outside the method is "+num1);
        System.out.println("The swaped value outside the method is "+num2);
    }
    public static void swap(int num1,int num2)
    {
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The swaped value inside the method is "+num1);
        System.out.println("The swaped value inside the method is "+num2);

    }
}
