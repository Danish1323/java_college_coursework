import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample{
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();

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