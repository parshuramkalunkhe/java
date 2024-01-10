//How do you find the count for the occurrence of a particular character in a string?

public class Program_4 {
	public static void main(String[] args){
		String s = "Hello world!";
		
		char c = 'l';

		int count = 0;

		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == c){
				count++;
			}
		}

		System.out.println(count);

	}
}
