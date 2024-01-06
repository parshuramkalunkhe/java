class OuterClass {
    private int data = 30;
    class InnerClass {
        void msg(){
            System.out.println("data is " + data);
        }
    }
}

public class Program_1 {
     public static void main(String[] args){
       OuterClass obj = new OuterClass();
       OuterClass.InnerClass inObj = obj.new InnerClass();

       inObj.msg();

    }
}
