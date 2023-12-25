abstract class P {
    abstract public void hello();
}

class C extends P {
    public void hello(){
        System.out.println("Hi i am abstract.");
    }
}

class Driver {
    public static void main(String[] args){
        C ref = new C();
        ref.hello();
    }
}
