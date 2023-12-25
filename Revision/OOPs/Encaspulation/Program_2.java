

class Product {
	private int no;
	private String name;
	private int quantity;
	private double price;

	public Product (int no, String name, int quantity, double price){
		this.no = no;
		this.name = name;
		this.quantity = quantity;
	 	this.price = price;
	}

	public int getNo(){
		return no;
	}

	public void setNo(int no){
		this.no = no;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getQua(){
		return quantity;
	}

	public void setQua(int quantity){
		this.quantity = quantity;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}
}

public class Program_2{
	public static void main(String[] args) {

		Product p1 = new Product(1, "Sai-clock", 2, 150);
		System.out.println("No. : " + p1.getNo());
		System.out.println("Name : " + p1.getName());
		System.out.println("Qua. : " + p1.getQua());

		p1.setNo(2);
		p1.setName("Sai-towel");
		p1.setQua(1);
		p1.setPrice(350);		

		System.out.println("Mod. No. : " + p1.getNo());
		System.out.println("Mod. Name : " + p1.getName());
		System.out.println("Mod. Qua. : " + p1.getQua());
		System.out.println();		
	
		Product p2 = new Product(2, "IPhone", 1, 150000);
		System.out.println("No. : " + p2.getNo());
		System.out.println("Name : " + p2.getName());
		System.out.println("Qua. : " + p2.getQua());

		p2.setNo(3);
		p2.setName("One Plus");
		p2.setQua(3);
		p2.setPrice(35000);		

		System.out.println("Mod. No. : " + p2.getNo());
		System.out.println("Mod. Name : " + p2.getName());
		System.out.println("Mod. Qua. : " + p2.getQua());
		System.out.println();		
	
		Product p3 = new Product(3, "Laptop", 4, 45000);
		System.out.println("No. : " + p3.getNo());
		System.out.println("Name : " + p3.getName());
		System.out.println("Qua. : " + p3.getQua());

		p2.setNo(4);
		p2.setName("Tablet");
		p2.setQua(3);
		p2.setPrice(52000);		

		System.out.println("Mod. No. : " + p3.getNo());
		System.out.println("Mod. Name : " + p3.getName());
		System.out.println("Mod. Qua. : " + p3.getQua());		
	}
}