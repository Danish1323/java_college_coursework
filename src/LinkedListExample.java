import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample{
    public static void main(String[] args){
        LinkedList<String> cities = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many cities do you want to enter: ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < num; i++){
            System.out.print("Enter the City you want to enter: ");
            String city = sc.nextLine();

            cities.add(city);
        }
        System.out.println(cities);
    }
}