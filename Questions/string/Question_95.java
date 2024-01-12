// Q.95. i/p Meet me at the clock tower o/p M%%t #me AT th% ##o## TOWER.
package string;

public class Question_95 {

	public static void main(String[] args) {
		String str = "Meet me at the clock tower";
		String[] strArr = str.split(" ");
		String res = "";
		for (int i = 0; i < strArr.length; i++) {
            if (i % 3 == 0){
				res = res + strVowel(strArr[i]) + " ";
            } else if (i % 3 == 1){
                res = res +strConsonent(strArr[i]) + " ";
            } else if (i % 3 == 2){
                res = res + strUppercase(strArr[i]) + " ";
            } else {
            	res = res + strArr[i] + " ";
            }
		}
		System.out.println(res);
	}

	public static String strVowel(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				ch[i] = '%';
			}
		}
		return new String(ch);
	}

	public static String strConsonent(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')) {
				ch[i] = '#';
			}
		}
		return new String(ch);
	}

	public static String strUppercase(String str) {
		String upperCase = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				upperCase = upperCase + (char) (str.charAt(i) - 32);
			} else {
				upperCase = upperCase + ch;
			}
		}
		return upperCase;
	}
}
