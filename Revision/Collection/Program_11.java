import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

class Program_11 {
    public static void main(String[] args){
        Stack stack = new Stack();

        stack.push(10);
        stack.push("Hi");
        stack.push(1.0);
        stack.push('D');
        stack.push(true);
        stack.push(null);

        System.out.println("Stack : " + stack);
        System.out.println();

        System.out.println("Using for-each loop.");
        for (Object obj : stack){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("Using Iterator.");
        Iterator i = stack.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();

        System.out.println("Using ListIterator.");
        ListIterator li = stack.listIterator();
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

        System.out.println("Removing Object : " + stack.pop());
        System.out.println();

        System.out.println("Peeking into stack : " + stack.peek());
        System.out.println();
    }
}
