package programs.general;

public class Fibonacci {
    public static void main(String[] args) {
        int limit = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + limit + " terms:");
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // Recursive method for Fibonacci
    public static int fibonacciRecursive(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }
}
