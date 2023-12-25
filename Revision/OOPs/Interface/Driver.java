interface I1 { void hi();}
interface I2 extends I1 { void bye();}

class C1 implements I1, I2 {
    public void hi(){System.out.println("Hi.");} // method overriding.
    public void bye(){System.out.println("Bye.");}
}

class Driver {
    public static void main(String[] args){
        C1 ref = new C1();
        ref.hi();
        ref.bye();
    }
}
