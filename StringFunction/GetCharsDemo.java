package StringFunction;
public class GetCharsDemo {
    public static void main(String[] args) {
        String s = "This is a pen";
        int startindex = 5;
        int endindex = 7;
        char ch[] = new char[endindex-startindex];
        s.getChars(startindex,endindex,ch,0);
        System.out.println(ch);
    }
}
