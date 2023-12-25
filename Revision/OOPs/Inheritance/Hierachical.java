class Parent {
	String s = "papa";
}
class Child1 extends Parent {}
class Child2 extends Parent {}
class Hierachical {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

		System.out.println(c1.s);
		System.out.println(c2.s);
	}
}
