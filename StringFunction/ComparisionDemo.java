package StringFunction;
//comparision between == and equals()
public class ComparisionDemo {
    public static void main(String[] args) {

        String s = "Prabin";
        String a = "Prabin";
        if(s==a)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println(s.equals(a));
    }
}
// difference between == and Equals is that == is a operator and Equals() is a method.
//here == checks if s and a are pointing to same memory location in string pool
//but equals() method checks the actual content of the s and a are same or not.