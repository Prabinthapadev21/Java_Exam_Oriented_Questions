package StringFunction;
public class StringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");  // Initial capacity = 21 (5 + 16)
        System.out.println("Initial Capacity: " + sb.capacity()); // Output: 21

        // Appending text that exceeds the current capacity of 21
        sb.append(" Java is awesome!");  // This exceeds the initial capacity of 21
        System.out.println("Capacity after append: " + sb.capacity());  // New capacity: 42
    }
}
