import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

class Program_8 {
    public static void main(String[] args){
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

        tmap.put(1, "SaiTeja");
        tmap.put(2, "SaiKiran");
        tmap.put(3, "Parshu");

        System.out.println("TreeMap : " + tmap);
        System.out.println();

        System.out.println("Map to Set : " + tmap.entrySet());
        System.out.println();

        System.out.println("Key Set : " + tmap.keySet());
        System.out.println();

        System.out.println("Values Set : " + tmap.values());
        System.out.println();

        Set set = tmap.entrySet();
        Set kset = tmap.keySet();

        System.out.println("Set Using for-each loop.");
        for (Object obj : set){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("Key Set Using for-each loop.");
        for (Object obj : kset){
            System.out.println(obj);
        }
        System.out.println();

    }
}
