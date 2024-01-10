

public class Program_2 {

    public static void main(String[] args) {
        String s = "radar";

        boolean isPalindrome = true;
        
		int length = s.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is '" + s + "' a palindrome? " + isPalindrome);
		
		palindrom(s);	
	}

	public static void palindrom(String str){
		int length = str.length();
		String rev = "";
		for (int i = length -1; i >= 0; i--){
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)){
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not a Palindrome.");
		}
	}
}

