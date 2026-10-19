// Import Scanner class to take input from the user
import java.util.Scanner;

// Create a class named whileloops
public class whileloopwalacode {
    public static void main(String[] args) {

        System.out.println("Name: Danish");
        System.out.println("Roll No: 147");

        // Scanner object to scan the input
        Scanner sc = new Scanner(System.in);
        String correctPassword = "Java@123";

        // 3 attempts
        int attempts = 3;

        while (attempts > 0) {

            // Ask the user to enter the password
            System.out.print("Enter password: ");

            // Take password input from the user
            String password = sc.nextLine();

            // check whether input and actual password is the same
            if (password.equals(correctPassword)) {

                // password correct walla message
                System.out.println("Login Successful");

                // Stop the while loop
                break;
            }

            // If password is incorrect, decrease attempts by 1
            attempts--;

            // Check if attempts are still remaining
            if (attempts > 0) {

                // Show incorrect password and remaining attempts
                System.out.println(
                        "Incorrect Password. Attempts left: " + attempts
                );

            } else {

                // If no attempts are left, lock the account
                System.out.println("Account Locked!");
            }
        }

        //scanner band
        sc.close();
    }
}