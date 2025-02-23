import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Performing the calculation..........");
        System.out.println("Enter the 1st number:");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2=sc.nextInt();
        if(num1<num2)
        {
            System.out.println("Error !! The 1st value should be greater than 2nd value..Now setting num2 to num1");
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        while(true)
        {
            System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod\n6.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    add(num1,num2);
                    break;
                    case 2:
                        sub(num1,num2);
                    break;
                    case 3:
                        mul(num1,num2);
                    break;
                    case 4:
                        div(num1,num2);
                    break;
                    case 5:
                        mod(num1,num2);
                    break;
                    case 6:
                        System.out.println("Exiting the program......");
                        return;
                default:
                    System.out.println("Please enter the correct options above...");
            }
        }
    }
    public static void add(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.println("The sum of the number is "+sum);
    }
    public static void mul(int num1,int num2)
    {
        int multi=num1*num2;
        System.out.println("The multiplication of the number is "+multi);
    }
    public static void div(int num1,int num2)
    {
        int dive=num1/num2;
        System.out.println("The division of the number is "+dive);
    }
    public static void mod(int num1,int num2)
    {
        int modulus=num1%num2;
        System.out.println("The reminder of the number is "+modulus);
    }
    public static void sub(int num1,int num2)
    {
        int dif=num1-num2;
        System.out.println("The subtraction of the number is "+dif);
    }

}