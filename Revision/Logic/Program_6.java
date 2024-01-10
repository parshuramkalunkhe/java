

public class Program_6{

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            // Handling an empty array case
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0]; // Initialize max as the first element of the array

        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 23, 56, 87, 34};

        int maxElement = findMax(numbers);

        System.out.println("The maximum element in the array is: " + maxElement);
    }

}
