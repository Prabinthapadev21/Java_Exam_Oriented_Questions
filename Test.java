 class Rectangle {
     int length;
     int breadth;

     public Rectangle(int length, int breadth) {
         this.length = length;
         this.breadth = breadth;
     }
     public void perimeter()
     {
         int perimeter = 2*(length+breadth);
         System.out.println("The perimeter is "+perimeter);
     }
     public void area()
     {
         int area = length*breadth;
         System.out.println("The area is "+area);
     }
 }
    public class Test
    {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle(4,5);
            Rectangle r2 = new Rectangle(4,5);
            r1.perimeter();
            r1.area();
            r2.perimeter();
            r2.area();
        }
    }

