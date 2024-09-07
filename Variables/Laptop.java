class Laptop
{
   static int x=10;
          int y=30;
public static void main(String[]args)
 {
  System.out.println("This is Laptop class");

  System.out.println(Laptop.x);  
 
  Laptop l1 = new Laptop();        // Object Created
  System.out.println(l1.x);
  System.out.println(l1.y);
 }
}