package OOPsConcept;
public class AccessMofifiers {
    public int var1=10;
    private int var2 = 20;
    protected int var3 = 30;
    int var4= 40;
    public void showPublic()
    {
        System.out.println("Public Method");
    }
    private void showPrivate()
    {
        System.out.println("Private method");
    }
    protected void showProtected()
    {
        System.out.println("Protected method");
    }
    void showDefault()
    {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        AccessMofifiers am = new AccessMofifiers();
        am.showPublic();
        am.showPrivate();
        am.showProtected();
        am.showDefault();
    }
}
