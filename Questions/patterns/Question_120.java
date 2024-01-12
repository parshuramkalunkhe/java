package patterns;

public class Question_120 {
	public static void main(String[] args) {
		for (int row = 0; row <= 5; row++) {
			for (int col = 5; col >= 0; col--) {
				if (row == col) { // row++ col == 6;
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
