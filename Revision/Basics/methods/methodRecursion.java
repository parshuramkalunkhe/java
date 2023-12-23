class methodRecursion {
	public static void sheela(int n){
		if (n <= 10){
			System.out.println("sheela.");
			sheela(n + 1);
		}
	}

	public static void main(String[] args) {
		sheela(2);
	}
}
