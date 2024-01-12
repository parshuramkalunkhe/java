package patterns;

public class Question_123 {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == 3 || (row + col == 4) || (col == 3 && row > 3) || (col - row == 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
