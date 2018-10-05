// Brug Scanner-klassen fra util-pakken
import java.util.Scanner;
   
public class ScannerTest
{

   
   public static void main(String[] args)
   {
      //opret skanner
      Scanner skanner = new Scanner(System.in);
      String s = skanner.nextLine();
      System.out.println("Du skrev: " + s);
      
      System.out.print("Tast et tal: ");
      int tal1 = skanner.nextInt();
      
      System.out.print("Tast endnu et tal: ");
      int tal2 = skanner.nextInt();
      
      int sum = tal1 + tal2;
      System.out.println("Summen er: " + sum);
      
      //selv om java lukke consol input gør vi det alligevel
      //det er en god vane
      skanner.close();
   }
}