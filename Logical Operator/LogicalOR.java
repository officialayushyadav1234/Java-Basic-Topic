class LogicalOR
{
 public static void main(String[] args)
{
  int a=20;
  int b=12;
  int c=32;
 
 System.out.println( a++>23 || ++b>21 );  // Output-> false
 System.out.println(a);                   // Output-> 21
 System.out.println(b);                   // Output-> 13
 System.out.println(c);                   // Output-> 32
}
}
