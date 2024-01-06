
class OuterClass {
    static int data = 30;
    static class InnerClass {
        static void msg(){
            System.out.println("Hello : " + data);
        }
    }
}


public class Program_6{
    public static void main(String[] args){
        OuterClass.InnerClass.msg();
    }
}
