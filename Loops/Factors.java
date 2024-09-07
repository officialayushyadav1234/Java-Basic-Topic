// WAJP to display count all the Factors of the No.

import java.util.Scanner;
class Factors
{
 public static void main(String[]args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the any number: ");
  int n= sc.nextInt();

  int i=1;
  int count=1;
  
  while(i<=n/2)
  {
    if(n%i==0)
     {
      System.out.println(i);
      count++;
     }
    i++;
  }
 System.out.println("Total number is: "+count);
}
}
    