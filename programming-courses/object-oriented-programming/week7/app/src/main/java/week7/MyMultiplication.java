package week7;

public class MyMultiplication {

    void multiply(int a, int b) {
        System.out.println(a * b);
    }

    void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String args[]) {
        MyMultiplication obj = new MyMultiplication();

        obj.multiply(25, 43);
        obj.multiply(34.56, 23.7);
    }
}
