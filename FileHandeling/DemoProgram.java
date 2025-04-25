
public class GBDemo
{


    protected void finalize() throws Exception
    {
        System.out.println("The Garbage is collected");
    }



    public static void main(String[] args) {
        GBDemo g1= new GBDemo();
        GBDemo g2 = new GBDemo();

        g1= null;
        g2=null;
        System.gc();   // this is to request for garbage collection

    }
}


