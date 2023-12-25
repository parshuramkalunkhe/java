class P1 {
	String name;
	double salary;

	static
	{
		System.out.println("SIB - Super class.");
	}

	{
		System.out.println("IIB - Super class.");
	}
}

class P2 extends P1 {
	
	P2(String name, double salary){
		this.name = name;
		this.salary = salary; 
	}
	
	private int sal;

	public int getSal(){
		return sal;
	}

	static
	{
		System.out.println("SIB - Sub class.");
	}
	
	{
		System.out.println("IIB - Sub class.");
	}
	
	public void setSal(int sal){
		this.sal = sal;
	}
}

class Driver {
	public static void main(String[] args) {
		P2 ref = new P2("Sheela", 12000);
		ref.setSal(20000);
		System.out.println(ref.getSal());
		System.out.println(ref.name);
		System.out.println(ref.salary);
	}
}
