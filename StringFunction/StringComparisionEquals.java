package StringFunction;
public class StringComparisionEquals {
    public static void main(String[] args) {
        String s1 = "Prabin";
        String s2 = "Prabin";
        boolean istrue =s1.equals(s2);
        System.out.println(istrue);
    }
}
// here the equals is case sensitive so Prabin and prabin are different so it returns false
