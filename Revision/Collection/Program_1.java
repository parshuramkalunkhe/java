import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Program_1 {
public static void main(String[] args){
	ArrayList list = new ArrayList();
	System.out.println("** ArrayList **");

	list.add("Hi");
	list.add(10);
	list.add(10.2);
	list.add('C');
	list.add(true);
	list.add(null);

	System.out.println();

	System.out.println("ArrayList list : " + list);
	System.out.println();

	System.out.println("Using Get Index.");
	for (int i = 0; i < list.size(); i++){
		System.out.println(list.get(i));
	}

	System.out.println();

	System.out.print("Using for-each Loop.");
	for (Object obj : list){
		System.out.println(obj);
	}

	System.out.println();

	Iterator i = list.iterator();

	System.out.println("Using Iterator.");

	while(i.hasNext()){
		System.out.println(i.next());
	}

	System.out.println();

	ListIterator li = list.listIterator();

	System.out.println("Using ListIterator.");
	System.out.println("Forward Direction.");

	while(li.hasNext()){
		System.out.println(li.next());
	}

	System.out.println();

	System.out.println("Backward Direction.");
	while(li.hasPrevious()){
		System.out.println(li.previous());
	}

	System.out.println();

	}
}




