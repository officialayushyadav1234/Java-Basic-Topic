class ConcatinationInterView
{ 
 public static void main(String[]args)
{
  // Conctination

  int x=22;
  int y=23;

  System.out.println("The Sum is: " +x+y);
  System.out.println(x+y+ "is the Sum");
  System.out.println(x+y+ "is the sum" +x+y);
//  System.out.println("The Value is" +x-y);   ->  Compile Time Error
  System.out.println(x-y+ "is the value");
  System.out.println("The Value is" +(x+y));
  System.out.println("The value is"+(x-y));
  System.out.println("The value is"+(x*y));
  System.out.println("The value is"+(x/y));
  System.out.println("The value is"+(y/x));
  System.out.println("The value is"+(x%y));
  System.out.println("The value is"+(y%x));
  System.out.println(x+'d'+12+"ayush"+x*y+'d'+(12+'d'*7)+x/4);

}
}