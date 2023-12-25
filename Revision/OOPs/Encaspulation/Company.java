class Employee{
	int id;
	String name;
	private double sal;

	Employee(int id, String name, double sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	// permission --> you need permissions to access private data outside of class
	// setter method --> to set/modify private data
	public void setSal(double sal){
		this.sal = sal;
	}
	// getter method --> to get/access private data
	public double getSal(){
		return sal;
	}
}

class Company{
    public static void main(String[] args){
		Employee e1 = new Employee(1, "thara bhai jogindar", 12000);
		Employee e2 = new Employee(2, "hindustani bhau", 15000);

		System.out.println("/** ==== Company ==== **/");
		System.out.println("ID : " + e1.id);
		System.out.println("Name : " + e1.name);
		System.out.println("Salary : " + e1.getSal());
		e1.setSal(20000);
		System.out.println("New Salary : " + e1.getSal());
		System.out.println("=========================");
		System.out.println("ID : " + e2.id);
		System.out.println("Name : " + e2.name);
		System.out.println("Salary : " + e2.getSal());
		e2.setSal(25000);
		System.out.println("New Salary : " + e2.getSal());
		System.out.println("=========================");
	}
}
