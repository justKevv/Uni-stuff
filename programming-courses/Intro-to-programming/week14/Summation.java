package week14;

public class Summation {
    public static void main(String[] args) {
        PrintSummation(8);
    }
    

    static int SummationRecursive(int n) {
        if (n==0) {
            return 0;
        } else {
            return n + SummationRecursive(n-1);
        }
    }
    static void PrintSummation(int n) {
        String series = "";
        for (int i = 1; i <= n; i++) {
            series += i;
            if (i < n - 1) {
                series += "+";
            }
        }

        System.out.println(series + " = " + SummationRecursive(n));
    }
}
