

public class Program_5 {

    public static int totalMatchingElements(int[] arr, int target) {
        int total = 0;

        // Iterate through the array and sum up elements that match the target value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                total += arr[i];
            }
			System.out.println(arr[i] + " " + total);
        }

        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 5, 2, 7};
        int targetNumber = 2;

        int matchingTotal = totalMatchingElements(numbers, targetNumber);

        System.out.println("Total of matching elements with value " + targetNumber + ": " + matchingTotal);
    }
}

