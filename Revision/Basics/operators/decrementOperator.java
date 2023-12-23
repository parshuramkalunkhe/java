class decrementOperator {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Default value : " + a);

		// 1. Post Decrement Operator --> decrement after
		a--;
		System.out.println("Value after post decrement operator : " + a);

		// 2. Pre Decrement Operator --> decrement before
		--a;
		System.out.println("Value after pre decrement operator : " + a);
	}
}
