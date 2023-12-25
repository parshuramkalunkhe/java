class P {
	private double price; // no matter what private data can only access inside same class where it si declared.
	public double getPrice(){
		return price;
	}
}

class C extends P {
	public void data(){
		System.out.println("Printing from c : " + getPrice());
	}
}
class Ex {
	public static void main(String[] args){
		C ref = new C();
		ref.data();
		System.out.println("Printing from main : " + ref.getPrice());
	}
}
