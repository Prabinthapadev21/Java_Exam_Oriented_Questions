package OOPsConcept;
 class Demo
 {
     private String name;
     private int age;

     public void setName(String name)
     {
         this.name= name;
     }
     public String getName()
     {
         return name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     public static void main(String[] args) {
         Demo d = new Demo();
         d.setName("Prabin");
         d.setAge(21);

         System.out.println("Name = "+d.getName());
         System.out.println("Age = "+d.getAge());
     }
 }