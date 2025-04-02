package StringFunction;
public class StringBufferInsertReplace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prabin Thapa");
        sb.insert(0,"Hi");
        sb.replace(2,8,"Sasin");
        System.out.println(sb);
    }
}
