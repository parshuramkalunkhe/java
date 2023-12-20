import java.util.LinkedList;
import java.util.Iterator;

class Program_9 {
    public static void main(String[] args){
        LinkedList llist = new LinkedList();

        llist.offer("Hi");
        llist.offer(10);
        llist.offer(1.0);
        llist.offer('C');
        llist.offer(true);
        llist.offer(null);

        System.out.println("LinkedList : " + llist);
        System.out.println();

        System.out.println("Using for-each loop.");
        for (Object obj : llist){
            System.out.println(obj);
        }
        System.out.println();

        Iterator i = llist.iterator();
        System.out.println("Using Iterator.");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();

        System.out.println("To remove Object : "  + llist.poll());
        System.out.println();
    }
}
