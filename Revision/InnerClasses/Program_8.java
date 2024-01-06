
class OuterClass{
    interface InnerInterface{
        void msg();
    }
}

class NesstedClassInterface implements OuterClass.InnerInterface {
    public void msg(){
        System.out.println("Message");
    }
}

public class Program_8 {
    public static void main(String[] args){
        OuterClass msg = new NesstedClassInterface();
        msg.msg();
    }
}
