// WAJP to print last 2 digit is divisible by 6 .
  
import java.util.Scanner;
class LastTwoDigit 
{
    public static void main(String[] args) 
 {
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Number is: ");
      int n = sc.nextInt();
      
      String result = ((n%100)%6==0) ? "Divisible by 6" : "Not Divisible by 6";
       System.out.println(result);
    }
}