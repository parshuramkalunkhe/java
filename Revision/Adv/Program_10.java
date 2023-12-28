// Q.38. How to use lambda expression

interface I {
	void demo();
}

class Program_10 {
	public static void main(String[] args){
		I ref = () -> {
			System.out.println("Demo method.");
		}
		
		ref.demo();
	}
}
