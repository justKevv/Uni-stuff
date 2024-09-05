package week5;

public class Squared {
    public int num, squared;

    public Squared(int num, int squared) {
        this.num = num;
        this.squared = squared;
    }

    public int SquaredBF(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }

        return result;
    }

    public int SquaredDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (SquaredDC(a, n/2) * SquaredDC(a, n/2) * a);
            } else {
                return (SquaredDC(a, n/2) * SquaredDC(a, n/2));
            }
        }
    }
}
