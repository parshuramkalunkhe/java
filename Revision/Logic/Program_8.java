

public class Program_8 {

    public static void printFibonacci(int count) {
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci sequence up to " + count + " numbers: ");

        for (int i = 0; i < count; i++) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        int count = 10; // Change this to the desired number of Fibonacci numbers to print
        printFibonacci(count);
    }
}

