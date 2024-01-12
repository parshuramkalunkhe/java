package patterns;

public class Question_135 {
	public static void main(String[] args) {
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				if ((row + col == 14) || (row - col == 4) || (row + col == 6) || (col - row == 4)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}
}
