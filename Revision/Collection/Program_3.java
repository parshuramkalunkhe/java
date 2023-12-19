// WAP to add duplicates into LinkedList and remove duplicate objects.
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

class Program_3 {
    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.add(10);
        llist.add("Hello");
        llist.add(true);
        llist.add(10);
        llist.add(null);
        llist.add(true);

        System.out.println("LinkedList : " + llist);
        System.out.println();

        HashSet set = new HashSet(llist);

        System.out.println("Remove Duplicates : "  + set);
        System.out.println();

        System.out.println("Using for-each loop.");
        for (Object obj : set){
            System.out.println(obj);
        }
        System.out.println();

        Iterator i = set.iterator();
        System.out.println("Using Iterator.");
        while(i.hasNext()){
            System.out.println(i.next());
        }

        ListIterator li = llist.listIterator();
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

        LinkedList<Integer> llist1 = new LinkedList<Integer>(llist);
        System.out.println("Generic Collection : " + llist1);

    }
}
