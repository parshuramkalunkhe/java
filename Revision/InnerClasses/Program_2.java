
abstract class Person {
    abstract void eat();
}


public class Program_2 {
    public static void main(String[] args){
        Person p = new Person(){
            void eat(){
                System.out.println("Hello world!");
            }
        }

        Person p1 = () -> {
            void eat() {
                System.out.println("Hello world!");
            }
        }
        p.eat();
    }
}
