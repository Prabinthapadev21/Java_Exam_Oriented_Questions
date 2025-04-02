package StringFunction;
// it checks if a specific part (region) of one string matches a part of another string.
public class RegiionMathesdemo {
    public static void main(String[] args) {
        String s1 = "Hello, World!";
        String s2 = "World!";

// Comparing region from index 7 in s1 and index 0 in s2, up to length of s2
        boolean result = s1.regionMatches(7, s2, 0, s2.length());

        System.out.println("Result: " + result); // true

    }
}
