// Connecting libraries
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

            // Connecting keyboard input
            Scanner in = new Scanner(System.in);

            // This variable is responsible for the result of the action
            int c = 0;

            // Endless loop to keep going
            for (int i = 0; i < 1; i--){

                // Entering the first number
                System.out.print("\nEnter the first number: ");
                int a = in.nextInt();
                in.nextLine(); // "eats" the extra carriage return character and the program works correctly

                // Entering a special character
                System.out.print("Enter a special character: ");
                String simbol = in.nextLine();

                // Entering the second number
                System.out.print("Enter the second number: ");
                int b = in.nextInt();

                // Operation with numbers (add, subtract, multiply and divide)
                switch (simbol){
                    case "+": // Adding two numbers
                        c = a + b;
                        break;
                    case "-": // Subtracting two numbers
                        c = a - b;
                        break;
                    case "*": // Multiplication of two numbers
                        c = a * b;
                        break;
                    case "/": // Division of two numbers
                        c = a / b;
                        break;
                    default:
                        System.out.println("Error 345!"); // If we did not find the right solution, we display error 345 in the console
                }

                // Special character check
                if(simbol.equals("+") || simbol.equals("-") || simbol.equals("*") || simbol.equals("/")) {
                    System.out.println("\n" +a + " " + simbol + " " + b + " = " + c); // Sends the result to the console
                }else{
                    System.out.println("Error 346!"); // If we do not have a character from the list, we display error 346 in the console
                }

                // Enter a number to continue the program
                System.out.print("\nEnter 1 to continue: ");
                int d = in.nextInt();

                // Verification and further decision
                if (d == 1){
                    continue; // Continuation of the program
                }else{
                    break; // Termination of the program
                }
            }
    }
}
