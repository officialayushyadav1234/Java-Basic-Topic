import java.util.Scanner;
class SwitchProgram2
{
 public static void main(String [] args)
 {
  Scanner sc=new Scanner (System.in);
  System.out.println("Enter the Character:");
  char x=sc.next().charAt(0);
   switch(x)
     {
      case 'A':
      case 'a':
      case 'E':
      case 'e':
      case 'I':
      case 'i':
      case 'O':
      case 'o':
      case 'U':
      case 'u':
        System.out.println("This is Vowel Character");
        break;
      default :
           System.out.println("This is not Vowel Character");
     }  
  }
}