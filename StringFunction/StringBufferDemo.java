package StringFunction;
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello"+ " ");
        sb.append("There");
        sb.reverse();
        sb.delete(1,3);
        System.out.println(sb);
    }
}
// String is immutable because it cannot be modified directly; it creates a new object when modified.
//StringBuffer is mutable because it modifies the same object instead of creating a new one.
//public class StringMemoryExample {
//    public static void main(String[] args) {
//        String str1 = "Java";  // Created in String pool
//        String str2 = str1.concat(" Programming"); // New object created
//
//        System.out.println(str1); // Output: Java
//        System.out.println(str2); // Output: Java Programming
//    }
//}

//public class StringBufferExample {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" World"); // Modifies the same object
//        System.out.println(sb); // Output: Hello World
//    }
//}
