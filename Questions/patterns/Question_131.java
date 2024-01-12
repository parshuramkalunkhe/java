package patterns;

public class Question_131 {
	public static void main(String[] args) {
		int a1 = 65;
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row >= col) {
					System.out.print((char) a1 + " ");
					a1++;
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}
}
