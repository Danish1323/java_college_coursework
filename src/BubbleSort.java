import java.util.Scanner;

public class BubbleSort{
    // bubble sort, keeps swapping adjacent elements if they are in wrong order
    static int sort(int[] arr){
        int n = arr.length;

        // outer loop is for how many passes we do
        for(int pass = 0; pass < n-1; pass++){
            // inner loop compares each pair next to each other
            for (int i = 0; i < n-1; i++){
                if (arr[i] > arr[i+1]){
                    // swap them if left one is bigger than right one
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        return -1; // not really using this return value but keeping it since func is set to int
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ask user how many numbers they wanna sort
        System.out.println("How many numbers do you want to enter? ");
        int size = sc.nextInt();

        // making array based on that size
        int[] numbers = new int[size];

        // taking all the numbers from user
        System.out.println("Now enter " + size + " numbers: ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        sort(numbers);

        // printing the sorted array at the end
        System.out.println("Sorted array: ");
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}