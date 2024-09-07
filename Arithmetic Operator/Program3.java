class Program3
{
 public static void main(String[]args)
{
  int x=263;
  int digit1=x%10;
  System.out.println(digit1);   // Output-> 3
  
  x=x/10;
  int digit2=x%10;
  System.out.println(digit2);  // Output-> 6
  
  x=x/10;
  int digit3=x%10;
  System.out.println(digit3);  // Output-> 2
  
}
}   
