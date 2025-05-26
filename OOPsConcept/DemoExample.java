package OOPsConcept;
 interface Single
 {
     void display();
 }
 interface Double
 {
     void show();
 }
 class Triple implements Single,Double{
    public void display()
     {
         System.out.println("This is interface 1");
     }
   public   void show()
     {
         System.out.println("This is interface 2");
     }

     public static void main(String[] args) {
         Triple t = new Triple();
         t.display();
         t.show();
     }
 }
