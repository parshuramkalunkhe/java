// Q.75. 

import java.util.Scanner;
import java.util.ArrayList;

public class Question_75 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter Integer Objects.");
		while(true) {
			int num = sc.nextInt();
			list.add(num);
			if (num == -1) {
				break;
			}
			//list.add(num);
		}
		
		System.out.println("Objects in List : " + list);
		
		sc.close();
	}
}
