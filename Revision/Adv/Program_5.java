// Q.32 can interface have concrete methods

interface Animal {
	
	public static void noOfTails(){
		System.out.println("It has 1 tail.");
	}
	
	void sound();
	
	default public void noOfLegs(){
		System.out.println("It has 4 legs.");
	}
	
}

class Dog implements Animal {
	
	public void sound(){
		System.out.println("Bow Bow");
	}
	
}

class Cat implements Animal {
	
	public void sound(){
		System.out.println("Meow Meow");
	}
	
}

class Program_5 {
	public static void main(String[] args){
		
		Animal.noOfTails();
		
		Animal a1 = new Dog();
		a1.sound();
		a1.noOfLegs();
	
		Animal a2 = new Cat();
		a2.sound();
		a2.noOfLegs();
	
	}
}
