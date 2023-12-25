class P1 {

	private double k = 12000;
	
	static int i = 10;

	static void ride() {
		System.out.println("I'm riding..");
	}

	static {
		System.out.println("SIB --> Super class.");
	}

	{
		System.out.println("IIB --> Super class.");
	}

	public double getK(){
		return k;
	}
}

class P2 extends P1 {
	
	int j = 20;

	static
	{
		System.out.println("SIB --> Sub class.");
	}

	{
		System.out.println("IIB --> Sub class.");
	}
}

class P3 extends P2 {

	public void Hello(){
		getK();
		System.out.println("Class P3 j : " + j);
	}

}

class Driver {
	public static void main(String[] args){
		P3 ref = new P3();
		System.out.println("i: " + ref.i);
		System.out.println("j: " + ref.j);
		System.out.println("k: " + ref.getK());
		ref.Hello();
	}
}
