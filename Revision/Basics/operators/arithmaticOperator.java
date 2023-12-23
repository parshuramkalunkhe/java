class arithmaticOperator {
	public static void main(String[] args) {
		int a = 10, b = 20;
		// addition operator
		int add = a + b;
		System.out.println("Addition Operator : " + add);

		// substraction operator
		int sub = a - b;
		System.out.println("Substraction Operator : " + sub);

		// multiplication operator
		int mult = a * b;
		System.out.println("Multiplication Operator : " + mult);

		// division operator
		int div = a / b;
		System.out.println("Division Operator : " + div);

		// reminder/modulo operator 
		int mod = a % b;
		System.out.println("Reminder/Modulo Operator : " + mod);

		// adding two data type.
		int c = 10;
		double d = 30;
		System.out.println("Adding two data type. The result always will be stored inside bigger data type : " + (c + d));
	}
}
