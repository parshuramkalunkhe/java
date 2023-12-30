// Q.94. Reverse Character.

public class Question_94 {
	public static void main(String[] args) {
		String str = "This is saijeta";
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String resArr = "";
			for (int j = strArr[i].length() - 1; j >= 0; j--) {
				resArr = resArr + strArr[i].charAt(j);
			}
			System.out.print(resArr + " ");
//			strArr[i] = resArr;
		}
		
	}
}
