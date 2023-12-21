// Q.78. 

import java.util.Scanner;

public class Question_78 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[][] arr = new int[size][size];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				for (int ele = 0; ele < arr.length; ele++) {
					sum = arr[row][ele] + arr[ele][col];
				}
			}
		}

		System.out.println(sum);
		sc.close();
	}
}
