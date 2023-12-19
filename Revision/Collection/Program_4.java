
import java.util.Vector;
import java.util.HashSet;
import java.util.Iterator;

class Program_4 {
    public static void main(String[] args){
        System.out.println("** Vector **");

        Vector vect = new Vector();
        vect.add(10);
        vect.add(20.0);
        vect.add("Hello");
        vect.add('c');
        vect.add(true);
        vect.add(null);
        vect.add(10);
        vect.add("Hello");
        vect.add(null);

        System.out.println("Vector : " + vect);
        System.out.println();

        HashSet set = new HashSet(vect);

        System.out.println("After removing duplicates : " + set);
        System.out.println();

        System.out.println("Using for-each Loop.");
        for (Object obj : set){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("Using Iterator.");
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();

    }
}
