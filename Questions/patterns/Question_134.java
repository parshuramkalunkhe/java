package patterns;

public class Question_134 {
	public static void main(String[] args) {
		int n = 5;
		int nRows = n;
		int nCols = (n * 2) - 1;
		for (int row = 1; row <= nRows; row++) {
			for (int col = 1; col <= nCols; col++) {
				if (row == nRows || (row + col == nRows + 1) || (col - row == nRows - 1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}
}
