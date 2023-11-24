import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Random rand = new Random();

        for (int k = 0; k < n; k++) {
            int randomIndexToSwap = rand.nextInt(n);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[k];
            arr[k] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}