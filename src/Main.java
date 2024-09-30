import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    // Ask user for their birth month, if month is between 1 and 12 then display the month, else display error message.
    Scanner in = new Scanner(System.in);
    int month = 0;

    System.out.print("Enter your birth month between 1 and 12: ");
    month = in.nextInt();

    if (month >= 1 && month <= 12) {
      System.out.println("Your birth month is: " + month);
    } 
    else {
      System.out.println("You entered an invalid month value: " + month);
    }

   }
}
