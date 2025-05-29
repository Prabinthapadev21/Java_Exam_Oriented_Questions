package Practice;

class Mom{
    String toy="cat";
}
class tom extends Mom{
    String toy= "car";
    void show(){
        System.out.println(toy);
        System.out.println(super.toy);
    }
}

public class superDemo {
    public static void main(String[] args) {
        tom obj = new tom();
        obj.show();
    }
}
