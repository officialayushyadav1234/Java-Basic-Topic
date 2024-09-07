// WAJP to display Prime or Not of the taken No.

import java.util.Scanner;
class Prime
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
          count++;
       i++;
      }
    if (count==1)
      {
       System.out.println("This is Prime number");
      }
    else
      {
        System.out.println("Not Prime Number");
      }
}
}
    