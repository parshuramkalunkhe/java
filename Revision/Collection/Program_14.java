import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// create list mobile phones --> 4 properties , sort ascending on price

class Mobile implements Comparable<Object>{
    int id;
    String brand;
    double price;
    String color;

    public Mobile(int id, String brand, double price, String color){
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public int compareTo(Object obj){
		Mobile mobile = (Mobile)obj;
        if (this.price > mobile.price){
            return 1;
        } else if (this.price < mobile.price){
            return -1;
        } else {
            return 0;
        }
    }

	@Override
	public String toString(){
		return id + " " + brand + " " + price + " " + color;	
	}
}

class Program_14 {
    public static void main(String[] args){

	    Mobile iphone = new Mobile(1, "iphone", 67000, "golden");
	    Mobile oneplus = new Mobile(2, "oneplus", 57000, "black");
        Mobile oppo = new Mobile(3, "oppo", 44000, "white");
        Mobile vivo = new Mobile(4, "vivo", 33000, "pink");

        List<Mobile> list = new ArrayList<Mobile>();

        list.add(iphone);
        list.add(oneplus);
        list.add(oppo);
        list.add(vivo);

		System.out.println("Collection Before sort : " + list);
		System.out.println();

        Collections.sort(list);

		System.out.println("Collection After sort.");
        for (Object obj : list){
            Mobile mobile = (Mobile)obj;
            System.out.println(mobile.id + " " + mobile.brand + " " + mobile.price + " " + mobile.color);
        }
		System.out.println();
    }
}
