package Practice;

public class StringBUfferDeno {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.append("thapa"));
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.replace(1,3,"hi"));
        System.out.println(sb.insert(1,"everest"));
        System.out.println(sb.delete(1,2));
    }
}
