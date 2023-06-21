import java.util.Arrays;

public class SortNumericArray {
    public static void main(String[] args) {
        double[] arr = { 5.5, 10.1, 6.2, 8.6, 7.2 };
        double sum = 0;
        double avg = 0;

        // Sorting array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Calculating sum of array elements
        for (double num : arr) {
            sum += num;
        }

        // Calculating average of array elements
        if (arr.length > 0) {
            avg = sum / arr.length;
        }

        // Printing sorted array, sum and average
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum of array elements: " + sum);
        System.out.printf("Average of array elements: %.2f", avg);
    }
}
