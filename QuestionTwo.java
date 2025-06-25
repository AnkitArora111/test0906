package arraysOne;

public class QuestionTwo {

    static int secondLargest(int[] a) {
        int max1 = 0, max2 = 0;

        // Handle arrays with less than 2 elements
         if (a.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        } else {
            max1 = a[1];
            max2 = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }

        return max2;
    }

    public static void main(String[] args) {
        int[] a = {20, 42, 6, 25, 30, 88};
        System.out.println("Second largest element is: " + secondLargest(a));
    }
}
