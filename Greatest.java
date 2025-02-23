import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num= sc.nextInt();
        System.out.println("Enter the number2:");
        int num2=sc.nextInt();
        System.out.println("Enter the number3:");
        int num3=sc.nextInt();
        dispaly(num,num2,num3);
    }
    public static void dispaly(int num,int num2,int num3)
    {
        if(num>num2 && num>num3)
        {
            System.out.println(num+ " is greater.");
        } else if (num2>num && num2>num3) {
            System.out.println(num2 + " is greater.");
        }
        else
        {
            System.out.println(num3 +" is greater.");
        }
    }
}