package patterns;

public class Question_136 {
	public static void main(String[] args) {
		int n = 5;
		int nRows = n;
		int nCols = n * 2 - 1;

		// col^Comb^row = (row)! / (row - col)! * (col)!;

		for (int row = 0; row < nRows; row++) {
			for (int col = 1; col <= nRows - row; col++) {
				System.out.print(" ");
			}
			for (int col = 0; col < nCols; col++) {
				if (row >= col) {
					int x = (fact(row)) / (fact(row - col) * fact(col));
					System.out.print(x + " ");
				}
			}

			System.out.println();
		}
	}

	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
