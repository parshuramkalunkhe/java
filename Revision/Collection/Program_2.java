import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

class Program_2 {
    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.add("Hello");
        llist.add(10);
        llist.add(10.0);
        llist.add('C');
        llist.add(true);
        llist.add(null);
        llist.add(false);

        System.out.println("** LinkedList **");
        System.out.println();

        System.out.println("Using Get Index.");
        for (int i = 0; i < llist.size(); i++){
            System.out.println(llist.get(i));
        }

        System.out.println();

        System.out.println("Using for-each loop.");
        for (Object obj : llist){
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("Using Iterator.");
        Iterator i = llist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();

        System.out.println("Using ListIterator.");
        ListIterator li = llist.listIterator();
        System.out.println("Forward Direction.");
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println();

        System.out.println("Backward Direction.");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }


    }
}
