class GrandParent {
	String properties = "1 acre";
}
class Parent extends GrandParent {
	String flat = properties;
}
class Child extends Parent {
	
}

class MultiLevel {
	public static void main(String[] args){
		Parent p = new Child();
		System.out.println(p.flat);
	}
}
