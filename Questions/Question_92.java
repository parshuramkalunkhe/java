// Q.92 convert all consonent into #

public class Question_92 {
	public static void main(String[] args) {
		String str = "SaiTejagb";
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if (!(charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u' || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I'
					|| charArray[i] == 'O' || charArray[i] == 'U')) {
				charArray[i] = '#';
			}
		}
		
		String str2 = new String(charArray);
		System.out.println(str2);
	}
}
