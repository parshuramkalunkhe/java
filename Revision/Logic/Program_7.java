

public class Program_7 {
	public static void main(String[] args) {
        int[] numbers = {9, 3, 6, 1, 8, 2, 7, 5, 4};

        // Sorting the array in ascending order using Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            
			for (int j = 0; j < numbers.length - i - 1; j++) {
                
				if (numbers[j] > numbers[j + 1]) {
                    // Swapping elements if they are in the wrong order
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Displaying the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
