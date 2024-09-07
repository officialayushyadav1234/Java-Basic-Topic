class ImpProgram2
{
 public static void main(String []args)
{
  int a = 12;
  int b = ++a;
     b++;
  int c = a++ + --b;
  int d = a++ + ++b + c++;
     d++;
     c--; 
  System.out.println(a);    // Output-> 15
  System.out.println(b);    // Output-> 14
  System.out.println(c);    // Output-> 26
  System.out.println(d);    // Output-> 55
}
}