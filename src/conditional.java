import java.util.Scanner;

public class conditional{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("num1: " + num1 + " is the greatest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2: " + num2 + " is the greatest number");
        }else if (num3 > num1 && num3 > num2){
            System.out.println("num3: " + num3 + " is the greatest number");
        }else{
            System.out.println("Two or more numbers are equal!!");
        }

    }
}