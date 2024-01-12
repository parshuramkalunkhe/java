package patterns;

public class Question_130 {
	public static void main(String[] args) {
		int a = 65;
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row >= col) {
					System.out.print((char) a + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			a++;
		}
	}
}
