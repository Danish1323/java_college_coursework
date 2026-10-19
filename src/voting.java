import java.util.Scanner;

public class voting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (age >= 18 && age <= 50){
            System.out.println("You are eligible to vote");
        } else if (age > 50 && age <= 100) {
            System.out.println("Aap aaram kariye, ye buddho ka kaam nahi");
        } else if (age > 100){
            System.out.println("Are aap abhi zinda ho?");
        } else if (age < 18 && age >= 0) {
            System.out.println("Beta abhi to ande se nikle ho");
        } else if (age < 0){
            System.out.println("Are tum to paida bhi nahi hue abhi");
        } else{
            System.out.println("Asli age daalo please");
        }
    }
}