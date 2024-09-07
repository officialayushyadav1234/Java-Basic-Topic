class ImpProgram3
{
 public static void main(String []args)
{
  int a = 12;
     a++;
     ++a;
  int b = a++;
     b++;
  int c = a++ + --b;
     c--;
     --b;
  int d = ++a + b++ + --c;

  System.out.println(a);    // Output-> 17
  System.out.println(b);    // Output-> 14
  System.out.println(c);    // Output-> 27
  System.out.println(d);    // Output-> 57
}
}