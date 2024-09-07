
import java.util.Scanner;

class QuadaricEquation
{
 public static void main(String [] args)
{ 
  Scanner sc= new Scanner(System.in);

  System.out.println("Enter the Number");
  double a=sc.nextDouble();
  System.out.println("Enter the Number");
  double b=sc.nextDouble();
  System.out.println("Enter the Number");
  double c=sc.nextDouble();
 
  double d= b*b-4*a*c;

   if(d>=0)
   {
    System.out.println("It is now Real roots");
    double p=(-b+ Math.sqrt(d));
    double q=(-b+ Math.sqrt(d));
    
    System.out.println("1st Real root is:"+p);
    System.out.println("@nd Real root is:"+q);
   }
   else
     System.out.println("The Real root of d:" +d);
 }
}