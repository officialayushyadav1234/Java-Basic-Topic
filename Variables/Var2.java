class Var2
{
 public static void main(String[]args)
  {
    int x = 25;
    System.out.println(x);
    
    { int y = 45;
      System.out.println(y);
      System.out.println(x);
     }
  
    {  int z = 478;
       System.out.println(z);
       System.out.println(x);
    }

System.out.println(x); 
// System.out.println(y);   Error   
// System.out.println(z);   Error
 }
}