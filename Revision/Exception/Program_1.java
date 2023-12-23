// WAP to handle nullpointerexception with respect ot collection.

import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;

public class Program_1 {
	public static void main(String[] args){
		Set<Object> set = new TreeSet<Object>();
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		try {
			set.add(null);
			map.put(null, "String");
		} catch(Exception e){
			System.out.println("Null Pointer Exception : TreeSet cannot accept null object.");
			System.out.println("Null Pointer Exception : TreeMap cannot accept null object.");
			// System.out.println(e);
			// e.printStackTrace();
			System.out.println();
			System.out.println("TreeSet Handled.");
			System.out.println("TreeMap Handled.");
		} finally {
			System.out.println("Thank you.");
		}
		
	}
}