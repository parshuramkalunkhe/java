package patterns;

public class Question_133 {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row >= col) {
					System.out.print(col + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}
}
