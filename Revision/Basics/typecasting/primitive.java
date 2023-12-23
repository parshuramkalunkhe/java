class primitive {
	public static void main(String[] args) {
		// primitive typecasting --> Primitive to Primitive Typecasting. 
		// Divided into 2 parts
		// 1. Widening --> It is a process of converting smaller size primitive datatype into bigger size primitive data type. also known as /** Implicit Typecasting **/
		byte b = 100;
		short s = b;
		System.out.println("1. Widening --> byte b: " + b + " is converted into short s: " + s);

		// 2. Narrowing --> It a process of converting bigger size primitive datatype into smaller size primitive data type. also known as /** Explicit Typecasting **/
		short S = 1000;
		byte B = (byte)S;
		System.out.println("2. Narrowing --> short S: " + S + " is converted into byte B: " + B);
	}
}
