class P1 {
    int i = 10;
    public void sheela(){
        System.out.println("Super sheela.");
    }
}

class P2 extends P1 {
    static int i = 20;
    public void sheela(){
        System.out.println("Sub sheela.");
    }
}

class Driver{
    public static void main(String[] args){
        P1 ref1 = new P1();
        System.out.print(ref1.i + " : ");
        ref1.sheela();
        System.out.println("=========");

        P2 ref2 = new P2();
        System.out.print(ref2.i + " : ");
        ref2.sheela();
        System.out.println("=========");

        P1 ref3 = new P2();
        System.out.print(ref3.i + " : ");
        ref3.sheela();
        System.out.println("=========");

        P2 ref4 = (P2)ref3;
        System.out.print(ref4.i + " : ");
        ref4.sheela();
    }
}
