//Q.96. Create a program to capitalize the first character of each word in a String.
package string;

public class Question_96 {
	public static void main(String[] args) {
		String s = "1simply Easy learning 1tutorials point";
		String[] strArr = s.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(capitalize(strArr[i]) + " ");
		}
	}

	public static String capitalize(String str) {

		String upperCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0 && (ch >= 'a' && ch <= 'z')) {
				upperCase = upperCase + (char) (ch - 32);
			} else if (ch >= '0' && ch <= '9') {
				upperCase = upperCase + ch;
			} else {
				upperCase = upperCase + ch;
			}
		}
		return upperCase;
	}
	
}
