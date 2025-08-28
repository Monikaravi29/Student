import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept array size from the user
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        int[] array = new int[N];

        // Accept N integers into the array
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the array in reverse order
        System.out.println("Sorted array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
