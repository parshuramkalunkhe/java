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
	
	ArrayList<Integer> nlist = new ArrayList<Integer>();

	nlist.add(10);
	nlist.add(20);
	nlist.add(30);

	System.out.println("Generic List : " + nlist);
	System.out.println();

	list.addAll(nlist);

	System.out.println("Generic List is added to List : " + list);
	System.out.println();


	list.addAll(0, nlist);
	System.out.println("Now adding at 0 index : " + list);
	System.out.println();

	System.out.println("To Contains 'Hi' Object : " + list.contains("Hi"));
	System.out.println();	

	System.out.println("To Contains All Collection : " + list.containsAll(nlist));
	System.out.println();

	System.out.println("To check size of list : " + list.size());
	System.out.println();

	list.remove("Hi");
	System.out.println("After removing 'Hi' Object : " + list);
	System.out.println();

	list.remove(4);
	System.out.println("After removing Object form 4th index : " + list);
	System.out.println();

	list.removeAll(nlist);
	System.out.println("After removing a Collection : " + list);
	System.out.println();

	list.clear();
	System.out.println("After clearing the list : " + list);
	System.out.println();
	}

}




