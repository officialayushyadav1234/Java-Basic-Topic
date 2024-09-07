class LogicalAnd2
{
 public static void main(String []args)
{
  int a = 13;
  int b = 25;
  
  /* System.out.println( a++>10 && b++>23 );      Output-> true
     System.out.println( a++>10 &  b++>23 );      Output-> true
  System.out.println(a);                          Output-> 14
  System.out.println(b);                          Output-> 26
  */
  
  System.out.println( ++a>23 && b++>23 );   // Output-> false
  System.out.println(a);                    // Output-> 14
  System.out.println(b);                    // Output-> 25
  
  System.out.println( ++a>23 & b++>23 );    // Output-> false
  System.out.println(a);                    // Output-> 15
  System.out.println(b);                    // Output-> 26


}                               
}             

