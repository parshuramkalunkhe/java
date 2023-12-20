import java.util.Scanner;

class Program_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            System.out.println();

            System.out.println("Hello your age is : " + age);
            System.out.println();

        } catch(Exception e){
            System.out.println("Invalid input.");
            System.out.println(e);
            System.out.println();
        }

    }
}
