package arraysOne;

public class QuestionOne {

    public static void main(String[] args) {
        // Find the largest element in an array
        int a[] = {3, 5, 9, 2, 8};

        int result = maximum(a, a.length);
        System.out.println("The largest element is: " + result);
    }

    // Method defined outside main
    public static int maximum(int arr[], int n) {
        int i, max = arr[0];  // Start with first element
        for (i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
