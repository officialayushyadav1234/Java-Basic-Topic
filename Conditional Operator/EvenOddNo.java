// WAJP to print 3 digit no. upto 100-1000 .
  
import java.util.Scanner;
class EvenOddNo 
{
    public static void main(String[] args) 
 {
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Number is: ");
      int n = sc.nextInt();
      
      String result = (n%2==0) ? "This is Even Number" : "This is Odd number";
       System.out.println(result);
    }
}