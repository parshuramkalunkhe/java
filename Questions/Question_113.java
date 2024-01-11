// Q.113

public class Question_113 {
	public static void main(String[] args) {
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row == 0 || row == 5 - 1 || col == 0 || col == 5 - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < row; col++) {
				if (row == 0 || row == 5 - 1 || col == 0 || col == 5 - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == 3 || col == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == 3 && col == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == 3 || row == 5 || (col == 1 && row > 3) || (col == 3 && row < 3) || (col == 5 && row > 3)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == col) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
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

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == col) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 0; row <= 5; row++) {
			for (int col = 5; col >= 0; col--) {
				if (row == col) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
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

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (col == 3 || (row + col == 4) || (row == 3 && col > 3) || (row - col == 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row >= col) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row <= col) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row + col >= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row + col <= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("============================");
		System.out.println();
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row >= col) {
//					int n = col + 1;
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		int a = 65;
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row >= col) {
					System.out.print((char)a + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			a++;
		}
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		int a1 = 65;
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (row >= col) {
					System.out.print((char)a1 + " ");
					a1++;
				} else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		int c = 1;
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
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
