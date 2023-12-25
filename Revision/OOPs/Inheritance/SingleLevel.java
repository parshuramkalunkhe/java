class Parent {
	int i = 10;
}

class Child extends Parent {}

class SingleLevel {
	public static void main(String[] args){
		Parent p = new Child();
		Child c = (Child)p;
		System.out.println(c.i);
	}
}
