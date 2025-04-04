public class ExceptionDemo {
    public static void main(String[] args) {
        try
        {
            int i =0,b = 2;
            int div = b/i;
            System.out.println("This will not be executed");
        }
        catch (Exception e)
        {
            System.out.println("Exception got catched");
            e.printStackTrace();
        }
    }
}
