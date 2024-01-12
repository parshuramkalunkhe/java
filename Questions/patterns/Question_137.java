package patterns;

public class Question_137 {
	public static void main(String[] args) {
		for (int row = 1; row <= 7; row++) {
			for (int col = 1; col <= 5; col++) {
				if ((row == 1 && col < 4) || col == 1 || (col == 4 && (row < 4 && row > 1)) || (row == 4 && col < 4)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println();
		
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 9; col++) {
				if ((row == col)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println();
	}
}
