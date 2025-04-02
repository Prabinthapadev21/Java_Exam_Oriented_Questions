package StringFunction;
public class StringModification {
    public static void main(String[] args) {
        String s = "Hi i am Prabin Thapa";
        //substring() method have two parameters one is startingindex and endingindex
        //substring(statrtingindex);
        //substring(startingindex,endingindex);
       String a = s.substring(1);
       String b = s.substring(1,5);
        System.out.println(a);
        System.out.println(b);
    }
}
