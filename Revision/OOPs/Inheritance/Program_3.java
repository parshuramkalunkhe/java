// WAP hierachical inheritance.

class Car {
	char model;

	public void speed(){
		System.out.println("Speeders");		
	}
}

class TESLA extends Car {
	String brand = "TESLA";
	char model = 'S';

	public void speed(){
		System.out.println("I can reach upto 100 KM/S in 30s.");
	}
}

class NEXON extends Car {
	String brand = "NEXON";
    char model = 'K';

	public void speed(){
		System.out.println("I can reach upto 100 KM/S in 60s.");
	}
}



public class Program_3 {
	public static void main(String[] args){
		TESLA c1 = new TESLA();
		NEXON c2 = new NEXON();

		System.out.println("c1 : " + c1.brand);
		System.out.println("c1 : " + c1.model);

		c1.speed();		

		System.out.println("c2 : " + c2.brand);
		System.out.println("c2 : " + c2.model);

		c2.speed();
	}
}