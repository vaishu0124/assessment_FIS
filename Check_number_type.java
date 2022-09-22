# assessment_FIS

import java.util.Scanner;

public class OddTest {

   public static void main(String args[])
   {
      int n;
      System.out.println("Enter an integer: ");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      isOdd(n);

      boolean answer=isOdd(n);
      if (answer=true)
      {
          System.out.println(n +" is not odd");
      }

      if (answer=false)
      {
          System.out.println(n +" is Odd");
      }



   }
   public static boolean isOdd(int number)
   { 
    if(number % 2 == 0)
   {
        return true;
    }
    return false;

}
}
