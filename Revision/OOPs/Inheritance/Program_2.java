//	WAP to achieve multiple inheritance.

class Vehicle {
	String brand = "TATA";
	double price = 14;
	
	public void speed(){
		System.out.println("Speeding.");
	}

	public void range(){
		System.out.println("Range");
	}
}

class Car extends Vehicle {
	String color = "black";
	String made = "India";

	public void speed(){
		System.out.println("My speed is this.");
	}

	public void range(){
		System.out.println("My range is this.");
	}
}

class TATA extends Car {
	public void nexon(){
		System.out.println("Nexon");
	}
}

public class Program_2 {
	public static void main(String[] args) {
		TATA nexon = new TATA();
		System.out.println("Brand : " + nexon.brand);
		System.out.println("Price : " + nexon.price);
		System.out.println("Color : " + nexon.color);
		System.out.println("Made in : " + nexon.made);

		nexon.speed();
		nexon.range();
		nexon.nexon();
	}
}