
interface OuterInterface {
    void hi();
    interface InnerInterface{
        void msg();
    }
}

class NestedInterface implements OuterInterface.InnerInterface {
    public void msg(){
        System.out.println("Message");
    }
}

public class Program_7 {
    public static void main(String[] args){
        OuterInterface.InnerInterface msg = new NestedInterface();
        msg.msg();
    }
}
