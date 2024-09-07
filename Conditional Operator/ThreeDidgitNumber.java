// WAJP to print 3 digit no. upto 100-1000 .
  
import java.util.Scanner;
class ThreeDidgitNumber 
{
    public static void main(String[] args) 
 {
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Number is: ");
      int n = sc.nextInt();
      
      String result = (n>=100 && n<=999) ? "This is 3-Digit Number" : "This is not 3-Digit number";
       System.out.println(result);
    }
}