package ExceptionHandeling;
public class handelingException {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        try
        {
            System.out.println("Value at index 3:"+arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("This is the finally block. It runs always");
        }
        System.out.println("Program continues after handeling Exception.");
    }
}
