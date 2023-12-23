

class CheckedException {
    public static void demo() throws ClassNotFoundException {
        Class.forName("Bye");
    }
}

class UnCheckedException {
    public static void demo() throws ArrayIndexOutOfBoundsException {
        int a[] = {0,1,2,3};
        System.out.println(a[5]);
    }
}

public class Program_5 {
    public static void main(String[] args){
        try {
            CheckedException.demo();
        } catch (Exception e){
            System.out.println("CheckedException.demo() method throwing class not found exception.");
        }
        try {
            UnCheckedException.demo();
        } catch(Exception e){
            System.out.println("UnCheckedException.demo().a[5] array is throwing index out of bound exception.");
        }
    }
}
