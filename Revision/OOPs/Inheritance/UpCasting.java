class Parent {
	String properties;
}
class Child extends Parent {
	String flat;
}
class UpCasting {
	public static void main(String[] args){
		Parent p = new Child(); // UpCasting
		System.out.println(p.properties); // we can access superclass state / properties only.
		// System.out.println(p.flat); // we can not access subclass state / properties.
	}
}
