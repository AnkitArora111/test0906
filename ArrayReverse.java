import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        // Original array
        int a[] = {1, 2, 5, 6, 7, 8};

        // Initialize two pointers:
        // i → start of array
        // j → end of array
        int i = 0, j = a.length - 1, temp;

        // Loop until the two pointers meet or cross
        while (i < j) {
            // Swap elements at i and j
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            // Move pointers towards center
            i++;
            j--;
        }

        // Print the reversed array
        System.out.println(Arrays.toString(a));
    }
}
