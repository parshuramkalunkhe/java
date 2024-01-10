// How do you reverse a string?
public class Program_1{
	public static void main(String[] args){
		String s = "Hi";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--){
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
