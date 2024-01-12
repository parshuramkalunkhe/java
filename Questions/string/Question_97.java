// Q.97. input MU1M2B3AI4 OUPUT 6MUMBAI10

// COUNT CHARACTERS
// ADD CHARACTER
// SUM OF CHAR
// ASCII value 
package string;

public class Question_97 {
	public static void main(String[] args) {
		String s = "MU1M2B3AI4";
		char[] ch = s.toCharArray();
		String res = "";
		int sum = 0, count = 0;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
				res = res + ch[i];
				count++;
			} else if (ch[i] >= '0' && ch[i] <= '9') {
				sum = sum + (int) (ch[i] - 48); // 48 --> '0'
			} else {
				res = res + ch[i];
			}
		}

		System.out.println(count + res + sum);
		//		System.out.println(res.length() + res + sum);
		// char c = '0';
		// int n = c;
		// System.out.println(n);
	}

}
