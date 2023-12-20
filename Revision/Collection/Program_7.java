import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Iterator;

class Program_7 {

    public static void main(String[] args){
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
        lhmap.put(1, "Parshu");
        lhmap.put(2, "SaiTeja");
        lhmap.put(3, "Saikiran");

        System.out.println("LinkedHashMap : " + lhmap);
        System.out.println();

        System.out.println("Map to Set : " + lhmap.entrySet());
        System.out.println();

        Set set = lhmap.entrySet();

        System.out.println("Using for-each loop.");
        for (Object obj : set){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("Using Iterator.");
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
