// Q.104. * and NUmbers Square Patterns

public class Question_104 {
	public static void main(String[] args) {
		System.out.println("* Patterns\n");
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Row Number Patterns");
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Col Number Patterns");
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Row + Col Number Patterns");
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print((row + col) + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Col * Row Number Patterns");
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print((col * row) + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Hollow Square");
		int n = 4;
		int row, col;
		for (row = 0; row < n; row++) {
			for (col = 0; col < n; col++) {
				if (row == 0 || col == 0 || row == n - 1 || col == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
