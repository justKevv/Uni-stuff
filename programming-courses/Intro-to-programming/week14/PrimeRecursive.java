package week14;

public class PrimeRecursive {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(n + " is prime: " + isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n <= 1 || n % 2 == 0) {
            return false;
        }
        return isPrimeRecursive(n, 3);
    }

    private static boolean isPrimeRecursive(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(n, divisor + 2);
    }
}
