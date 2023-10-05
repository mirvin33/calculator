import java.util.Scanner;

public class App {
   static final Scanner inputScanner = new Scanner(System.in);

   private static String getString(String prompt) {
      System.out.println(prompt);
      return inputScanner.next();
   }

   private static double getDouble(String prompt) {
      System.out.println(prompt);
      return inputScanner.nextDouble();
   }

   public static void main(String[] args) {

      boolean calculationContinue = true;

      while (calculationContinue) {

         /*
          * String response = getString("Type a sentence");
          * double response2 = getDouble("Type a number");
          * System.out.println(response + " " + response2);
          */

         double num1 = getDouble("Type a number");
         
         double num2 = getDouble("Type another number");

         /*
          * System.out.println("You want to add " + num1 + " and " + num2);
          * System.out.println(String.format("You want to add %f and %f", num1, num2));
          */

         Calculator myCalculator = new Calculator();
         double response = myCalculator.add(num1, num2);
         System.out.println("Subtract: " + myCalculator.subtract(num1, num2));
         System.out.println("Multiply: " + myCalculator.multiply(num1, num2));
         System.out.println("Divide: " + myCalculator.divide(num1, num2));
         System.out.println("Add: " + response);

         String answer1 = getString("Would you like to continue?");

         if (answer1.equals("no") || answer1.equals("No")) {
            calculationContinue = false;
            System.out.println("Goodbye");
            
         }

      }

   }

}
