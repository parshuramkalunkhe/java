
class OuterClass {
    static int data = 30;
    static class InnerClass {
        void msg(){
            System.out.println("data is : " + data);
        }
    }
}

public class Program_5 {
    public static void main(String[] args){
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.msg();
    }
}
