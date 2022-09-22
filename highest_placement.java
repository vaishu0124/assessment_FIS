# assessment_FIS
import java.util.*;
import java.io.*;

public class MaxPlacements

{
  public static void main(String[] args) {
      int cse,ece,mech;
 try{
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the no. of students placed in CSE:");
        cse = sc.nextInt();
      System.out.print("Enter the no. of students placed in ECE:");
        ece = sc.nextInt();
    System.out.print("Enter the no. of students placed in MECH:");
        mech = sc.nextInt();
        sc.close();
 }
 catch (Exception e){
     System.out.println("Invalid Input");
     return;
     }
     if (cse < 0 || ece < 0 || mech < 0){
      System.out.println("Invalid Input");
      return;
      }
    if (cse == ece && ece == mech){
System.out.println("None of the departments got the highest placement.");
    return;
    }
System.out.println("Highest Placement:");
 if (cse == ece && cse > mech){
        System.out.println("CSE");
        System.out.println("ECE");
        }
else if (cse == mech && cse > ece){
         System.out.println("CSE");
         System.out.println("MECH");
    
}
else if (ece == mech && ece > cse){
        System.out.println("ECE");
         System.out.println("MECH");
}
 else if (cse > ece && cse > mech){
         System.out.println("CSE");
     }
else if (ece > mech){
           System.out.println("ECE");
}
else{
System.out.println("MECH");}
   }
}
