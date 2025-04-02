package StringFunction;
public class ToCharArrayDemo {
    public static void main(String[] args) {
        String s = "hello";
        char ch[] = s.toCharArray();
        for (char c:ch)
        {
            System.out.println(c);
        }
    }
}
