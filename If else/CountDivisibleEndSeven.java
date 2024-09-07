// WAJP to display count all the numbers upto 1000 which is divisible by 7 and end with last digit is 7.

class CountDivisibleEndSeven
{
 public static void main(String[]args)
{
  int i=1;
  int count=1;
  
  while(i<=1000)
  {
    if(i%7==0 && i%10==7)
     {
      System.out.println(i);
      count++;
     }
    i++;
  }
 System.out.println("Total number is:"+count);
}
}
    