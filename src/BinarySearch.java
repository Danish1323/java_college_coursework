import java.util.Scanner;

public class BinarySearch{
    // binary search, only works if array is sorted
    static int search(int[] arr, int target){
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2; // find the middle index

            if (arr[mid] == target){
                return mid; // found it right in the middle
            } else if(arr[mid] < target){
                low = mid + 1; // target is bigger so search right half
            } else {
                high = mid - 1; // target is smaller so search left half
            }
        }
        return -1; // not found anywhere
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ask how many numbers user wants to enter
        System.out.println("How many numbers do you want to enter? ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        // note: has to be sorted for binary search to actually work
        System.out.println("Now enter " + size + " numbers in sorted order: ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        // now ask for the target to search for
        System.out.println("Enter the number you wanna search for: ");
        int target = sc.nextInt();

        int result = search(numbers, target);

        System.out.println("Element is present at index: " + result);
    }
}