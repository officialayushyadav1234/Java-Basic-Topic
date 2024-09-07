class ImpProgram1
{
 public static void main(String []args)
{
  int a=12;
  int b=a++;
     b++;
  int c=a++ + --b;
  System.out.println(a);    // Output-> 14
  System.out.println(b);    // Output-> 12
  System.out.println(c);    // Output-> 25
}
}