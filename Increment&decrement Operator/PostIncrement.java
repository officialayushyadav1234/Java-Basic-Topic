class PostIncrement
{
 public static void main(String []args)
{
  int a=12;
      a=++a;
      a=++a;
      a=++a;
      a=--a;
      a=++a;
      a=++a;
   System.out.println(a);    // Output-> 16
}
}