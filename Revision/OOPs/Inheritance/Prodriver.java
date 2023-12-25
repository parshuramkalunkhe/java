// Parent class
class Vehicle {
	
	String brand;
	String color;
	double price;
	
	public void ride(){
		System.out.println("I'm riding burrrrr...");
	}

}

// Child class 
class Bike extends Vehicle {
	Bike(String brand, String color, double price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

}

// Driver class
class Prodriver {
	public static void main(String[] args){
		Bike ref = new Bike("RS 200", "Black", 150000);
		System.out.println("Brand : " + ref.brand);
		System.out.println("Color : " + ref.color);
		System.out.println("Price : " + ref.price);
		ref.ride();
	}
}
