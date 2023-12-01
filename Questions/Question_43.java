// Q.43. Convert binary number into decimal number;

import java.util.Scanner;

public class Question_43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Binary Number : ");
		int number = sc.nextInt();
		
		int sum = 0, power = 1, base = 2;
		while(number != 0) {
			int digit = number % 10;
			sum = sum + digit * power;
			number = number / 10;
			power = power * base;
		}
		
		System.out.println("Decimal Number : " + sum);
		
		sc.close();
	}
}
