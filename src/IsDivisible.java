import java.util.Scanner;

public class IsDivisible {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int integer = input.nextInt();
    
    System.out.print("Is " + " divisible by 5 and 6?");
    if (integer % 5 == 0 && integer % 6 == 0){
      System.out.println(" true");
    } // if
    else{
      System.out.println(" false");
    } // else
    
    System.out.print("Is " + integer + " divisible by 5 or 6?");
    if (integer % 5 == 0 || integer % 6 == 0){
      System.out.println(" true");
    } // if
    else{
      System.out.println(" false");  
    } // else
    
    System.out.print("Is " + integer + " divisible by 5 or 6, " + 
            "but not both?");
    if (integer % 5 == 0 ^ integer % 6 == 0)
      System.out.println(" true");
    else
      System.out.println(" false");
    
  }   // main 
} // IsDivisible
