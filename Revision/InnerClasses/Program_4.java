class LocalInner {
    private int data = 30;
    void display() {
        class LocalInnerClass {
            int value = 50;
            void msg() {
                System.out.println("data is : " + data + "value is : " + value);
            }
        }
        LocalInnerClass l = new LocalInnerClass();
        l.msg();
    }
}

public class Program_4 {
    public static void main(String[] args){
        LocalInner obj = new LocalInner();
        obj.display();
    }
}
