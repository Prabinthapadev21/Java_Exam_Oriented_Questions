package OOPsConcept;
 class Single{
     public void display()
     {
         System.out.println("Class Single");
     }
 }
 class Double extends Single
 {
     public void show()
     {
         System.out.println("Class Double");
     }
 }
 class Triple extends Double{
     public static void main(String[] args) {
         Triple t = new Triple();
         t.display();
         t.show();
     }
 }
