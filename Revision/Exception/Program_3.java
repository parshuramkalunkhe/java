// WAP to create inputmissmatch exception and handled the exception and print any mandatory statements.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Program_3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try {
			int num = sc.nextInt();
		} catch (InputMismatchException ie){
			//ie.printStackTrace();
			System.out.println("Handled.");
		} finally {
			System.out.println("Thanks me later.");		
		}
	}
} 