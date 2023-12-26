
interface TESLA {
	String teslaModel = "S";

	public void speed(){
		System.out.println("My speed is 400 KM/H");
	}
}

interface TATA {
	String tataModel = "nexon";

	public void speed() {
		System.out.println("My speed is 300 KM/H");
	}
}

class Car TESLA,TATA {
	
}

public class Program_4 {
	public static void main(String[] args){
		Car c1 = new Car();

		System.out.println("C1 : " + c1.teslaModel);
		System.out.println("C1 : " + c1.tataModel);

		c1.speed();
	}	
}