// Q.33 How to achive multiple inheritance using interface if interface is allow concrete methods
// 		How to use logic of first interface in multiple interface implementing classes

interface I1{
	
	public void demo();
	
	default public void test(){
		System.out.println("I1");
	}
	
}

interface I2 {
	void demo();
	default public void test(){
		System.out.println("I2");
	}
}

class C1 implements I1, I2 {
	
	public void demo(){
		System.out.println("C1");
	}
	
	public void test(){
		I1.super.test();
		I2.suepr.test();
	}
	
}

class Program_6 {
	
	public static void main(String[] args){
	
		I1 i = new C1();
		i.demo();
		i.test();
		
	}
	
}
