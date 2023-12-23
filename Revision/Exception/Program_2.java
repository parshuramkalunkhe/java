// WAP to create class cast exception and handled exception and print mandatory statements.

import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;

public class Program_2{
	public static void main(String[] args){
		Set set = new TreeSet();
		Map map = new TreeMap();

		try {
			//set.add(10);
			//set.add("String");
			map.put(1, "Sai");
			map.put("String", "Hi");
		} catch (Exception e){
			//System.out.println(e);
			e.printStackTrace();
			System.out.println("Handled.");
		} finally {
			System.out.println("Thanks me later.");
		}
	}
}