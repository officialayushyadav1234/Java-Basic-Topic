// WAJP to display count all the numbers upto 100 which is divisible by 7.

class CountDivisible
{
 public static void main(String[]args)
{
  int i=1;
  int count=1;
  
  while(i<=100)
  {
    if(i%7==0)
     {
      System.out.println(i);
      count++;
     }
    i++;
  }
 System.out.println("Total number is:"+count);
}
}
    