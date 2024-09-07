
import java.util.Scanner;
class DivisibleOrNot
{
 public static void main(String [] args)
{ 
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Number");
  int x= sc.nextInt();

  if(x>=100 && x<=999)
   {
     System.out.println("It is 3-Digit Number");
     if(x%12 == 0)
     System.out.println("It is divisible by 12");
     else
     System.out.println("It is not divisible by 12");
    }
  else
    {
      System.out.println("It is not 3-digit Number");
      if(x%7 == 0)
       System.out.println("It is divisible by 7");
      else
       System.out.println("It is not divisible by 7");
     }
 }
}