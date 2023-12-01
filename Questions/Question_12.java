// Q.12. Write a Program to check if the number is prime number or not.

import java.util.Scanner;

public class Question_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= range; i++) {
			if (range % i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println("Prime Number.");
		} else {
			System.out.println("Not a Prime Number.");
		}
		
		sc.close();
	}
}
