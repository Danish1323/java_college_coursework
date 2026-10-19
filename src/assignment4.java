import java.util.Scanner;

public class assignment4{
    // linear search function, just loops through the array one by one
    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i; // found it, return the index
            }
        }
        return -1; // didnt find it so return -1
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // asking user how many numbers they want to enter
        System.out.println("How many numbers do you want to enter? ");
        int size = sc.nextInt();

        // making the array based on the size they gave
        int[] numbers = new int[size];

        // loop to get all the numbers from user one by one
        System.out.println("Now enter " + size + " numbers: ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        // now ask for the target number to search for
        System.out.println("Enter the number you wanna search for: ");
        int target = sc.nextInt();

        int position = search(numbers, target);

        // check if it was found or not and print accordingly
        if (position == -1){
            System.out.println(target + " was not found in the array");
        }else{
            System.out.println(target + " was found at the index " + position);
        }
    }
}