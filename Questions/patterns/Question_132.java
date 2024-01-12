package patterns;

public class Question_132 {
	public static void main(String[] args) {
		int c = 1;
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				if (row >= col) {
					System.out.print(c + " ");
					c++;
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}
}
