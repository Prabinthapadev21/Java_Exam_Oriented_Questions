package StringFunction;
public class StringComparisionEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "Prabin";
        String s2 = "prabin";
        boolean isTrue = s1.equalsIgnoreCase(s2);
        System.out.println(isTrue);
    }
}
// this string comparision is not case sensitive so Prabin and pprabin are same and it returns true