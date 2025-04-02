package StringFunction;
public class StringStartsWith {
    public static void main(String[] args) {
        String s="Hi i am Prabin Thapa";
        System.out.println( s.startsWith("am"));
        System.out.println("hello".startsWith("hi"));
        System.out.println(s.startsWith("Pr",8));
        System.out.println(s.endsWith("pa"));
    }
}
