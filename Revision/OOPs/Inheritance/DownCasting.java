class Parent {
	String properties;
}

class Child extends Parent {
	String flat;
} 

class DownCasting {
	public static void main(String[] args) {
		Parent p = new Child(); // Up Casting
		Child c = (Child)p; // Down Casting
		System.out.println(c.flat);					// To overcome the problem with UpCasting we need Down Casting.
	}
}
