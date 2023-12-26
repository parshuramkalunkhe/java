// WAP to achieve single level inheritance.

class Vehicle {
	String color;
	String brand;

	public void speed(){
		System.out.println("I am speeding.");
	}

	public void range(){
		System.out.println("My range is this.");
	}
}

class Car extends Vehicle {
	public Car(String color, String brand){
		this.color = color;
		this.brand = brand;
	}
}

public class Program_1 {
	public static void main(String[] args) {
		Car c1 = new Car("Black", "TATA");

		System.out.println("Brand : " + c1.brand);
		System.out.println("Color : " + c1.color);
		c1.speed();
		c1.range();
	}
}