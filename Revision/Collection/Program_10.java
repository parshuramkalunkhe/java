import java.util.PriorityQueue;
import java.util.Iterator;

class Program_10 {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue();

        pq.offer(-100);
        pq.offer(10);
        pq.offer(1);
        pq.offer(-1000);
        pq.offer(10000);

        System.out.println("PriorityQueue : " + pq);
        System.out.println();

        System.out.println("Using for-each loop.");
        for (Object obj : pq){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("Using Iterator.");
        Iterator i = pq.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();

        System.out.println("Removing Object : " + pq.poll());
        System.out.println();
    }
}
