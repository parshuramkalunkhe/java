// Q.91 to convert all the vowels into %

public class Question_91 {
	public static void main(String[] args) {
		String str = "SaiTeja";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u' || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I'
					|| charArray[i] == 'O' || charArray[i] == 'U') {
				charArray[i] = '%';
			}
		}

		String str1 = new String(charArray);
		System.out.print(str1);
	}
}

//char[] arr = str.toCharArray();
//System.out.println(Arrays.toString(arr));
//
//char[] str2 = new char[str.length()];
//
//for (int i = 0; i < str.length(); i++) {
//	str2[i] = str.charAt(i);
//}
//
//
//for (int i = 0; i < str2.length; i++) {
//	System.out.print(str2[i] + " ");
//}
//System.out.println();
//System.out.println(Arrays.toString(str2));
