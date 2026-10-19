// Bring in Scanner so we can read user input
import java.util.Scanner;

public class dowhileloopwalacode {
    public static void main(String[] args) {

        // Scanner ready
        Scanner sc = new Scanner(System.in);

        // User's menu choice
        int choice;

        // Run at least once, keep going until they exit
        do {

            // Show calculator menu
            System.out.println("\n===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            // Ask for choice
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            // If choice is 1`1–4, do math
            if (choice >= 1 && choice <= 4) {

                // Get first number
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                // Get second number
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                // Pick operation based on choice
                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Result = " + (a / b));
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                }

            } else if (choice != 5) {
                // Not 1–4 and not exit → invalid
                System.out.println("Invalid choice!");
            }

            // Repeat until user chooses 5
        } while (choice != 5);

        // Goodbye message
        System.out.println("Calculator closed.");

        // Clean up
        sc.close();
    }
}