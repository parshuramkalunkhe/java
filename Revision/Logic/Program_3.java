// How do you calculate the number of numerical digits in a string?

public class Program_3 {
	public static void main(String[] args){
		String s = "Pars231pa342psd";
		int count = 0;
		for (int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9'){
				count++;
			}
		}

		System.out.println(count);

	}
}
