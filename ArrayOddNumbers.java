public class ArrayOddNumbers {
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25,30};
        calculatesum(arr);
    }
    public static void calculatesum(int arr[])
    {
        int sum = 0;
        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                sum +=arr[i];
            }
        }
        System.out.println("The sum of odd elements of the array is "+sum);
    }
}
