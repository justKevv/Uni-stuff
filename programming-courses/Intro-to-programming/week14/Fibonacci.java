package week14;

public class Fibonacci {
    public static void main(String[] args) {
        PrintFibonacci(12);
    }

    static int FibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2);
        }
    }

    static void PrintFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(FibonacciRecursion(i) + " ");
        }
    }
}
