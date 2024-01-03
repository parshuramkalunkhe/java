// Q.98. wap to count all the occurences of characters in the string
// WAP to display all the unique characters in the string.
// WAP to display all the duplicate charcters in the string.

public class Question_98 {
	public static void main(String[] args) {
		String s = "maharashtra";
		boolean[] b = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (b[i] == false) {
				int count = 1; 
				for (int j = i + 1; j < s.length(); j++) {
					if(s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}
				// Q.1
				//System.out.print(s.charAt(i) + " : " + count + " ");
				// Q.2
//				if (count == 1) {
//					System.out.print(s.charAt(i) + " ");
//				}
				//Q.3
				if (count > 1) {
					System.out.print(s.charAt(i) + " ");
				}
			}
		}
	}
}
