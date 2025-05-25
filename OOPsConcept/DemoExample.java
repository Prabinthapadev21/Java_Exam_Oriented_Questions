package OOPsConcept;
 class Single
 {
     public void display()
     {
         System.out.println("Hello");
     }
 }
 class Double extends Single
 {
     public static void main(String[] args) {
         Double d = new Double();
         d.display();
     }
 }
