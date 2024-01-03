// Q.99. First unique character in string.

import java.util.Scanner;

public class Question_99 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String : ");
		String s = sc.next();

		boolean[] b = new boolean[s.length()];
//		int index = 0;
		int index = -1;

		for (int i = 0; i < s.length(); i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}

//				if (count == 1) {
//					index = i + 1;
//					System.out.println("First Unique Character : " + s.charAt(i));
//					break;
//				} else {
//					index = -1;
//				}

				if (count == 1) {
					index = i + 1;
					break;
				}
			}
		}
		System.out.println("Position : " + index);
		sc.close();
	}
}
