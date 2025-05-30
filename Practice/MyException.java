package Practice;

public class MyException {
    public static void main(String[] args) throws Exception {
        int age = 18;
        if(age>=18)
        {
            System.out.println("He can vote");
        }
        else
        {
            throw new Exception("He cannot vote");
        }
    }
}
