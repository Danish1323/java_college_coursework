class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
public class UD_Excep {
    public static void main(String[] args) {
        int age = 21;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18");
            }
            System.out.println("Valid age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}