// Write a java program to convert hashet into treeset and only characters.

import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;

class Program_5 {
    public static void main(String[] args){
        HashSet<Character> set = new HashSet<Character>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        System.out.println("HashSet : " + set);
        System.out.println();

        TreeSet tset = new TreeSet(set);
        System.out.println("TreeSet ASC : " + tset);
        System.out.println("TreeSet DESC : " + tset.descendingSet());
        System.out.println();

        ArrayList list = new ArrayList(tset);
        System.out.println("ArrayList : " + list);
        System.out.println();

    }
}
