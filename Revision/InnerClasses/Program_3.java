interface Edable {
    void mango();
}

public class Program_3 {
    public static void main(String[] args){
        Edable e = new Edable(){
            void mango(){
                System.out.println("Mango");
            }
        }

        // lambda expresssion
        Edable e = () -> {
            void mango(){
                System.out.println();
            }
        }

        e.mango();
    }
}
