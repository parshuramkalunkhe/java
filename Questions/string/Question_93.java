//Q.93. reverse string.
package string;

public class Question_93 {
	public static void main(String[] args) {
		String str = "This is saiteja";

		String[] strArr = str.split(" ");
		
		String str1 = "";

		for (int i = strArr.length - 1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
			str1 = str1 + strArr[i] + " ";
		}
		System.out.println();
		System.out.println(str1);

	}
}
