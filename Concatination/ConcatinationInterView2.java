class ConcatinationInterView2
{ 
 public static void main(String[]args)
{
  // Q.1-> Given any Number Print each Digit one by one from Unit Place?
  // Ans.
          int x=23364;
          System.out.println(x % 10);    // Output-> 4
          x=x/10;                        // x=2336
          System.out.println(x%10);      // Output-> 6
          x=x/10;                        // x=233
          System.out.println(x%10);      // Output-> 3 
          x=x/10;                        // x=23
          System.out.println(x%10);      // Output-> 3
          x=x/10;                        // x=2
          System.out.println(x);         // Output-> 2
}
}