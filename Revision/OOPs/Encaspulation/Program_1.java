// WAP to std id, name, loc hide all the field// id should not be modified

class Student {
	private int id;
	private String name;
	private String location;
	
	public Student(int id, String name, String location){
		this.id = id;
		this.name = name;
		this.location = location;	
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getLocation(){
		return location;
	}

	public void setLocation(String location){
		this.location = location;
	}
}

public class Program_1 {
	public static void main(String[] args){
		Student s1 = new Student(1, "SaiTeja", "Bhiwandi");

		System.out.println("Id : " + s1.getId());
		System.out.println("Name : " + s1.getName());
		System.out.println("Location : " + s1.getLocation());

		s1.setName("Saikiran");
		s1.setLocation("Thane");

		System.out.println("Mod. Name : " + s1.getName());
		System.out.println("Mod. Location : " + s1.getLocation());
		
	}
}