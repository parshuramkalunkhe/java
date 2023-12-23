class incrementOperator {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Value without increment operator : " + a);
		
		// 1. Post Increment Operator --> increment after
		a++;
		System.out.println("Value with post increment operator : " + a);
		
		// 2. Pre Increment Operator --> increment before
		++a;
		System.out.println("Value with pre increment operator : " + a);
	}
}
