package week7;

public class Triangle {
    private int angle;

    int totalAngle(int angleA) {
        return angle = 180 - angleA;
    }

    int totalAngle(int angleA, int angleB) {
        return angle = 180 - (angleA + angleB);
    }

    int area(int angleA, int angleB, int angleC) {
        return angleA + angleB + angleC;
    }

    double area(int angleA, int angleB) {
        return Math.sqrt(Math.pow(angleA, 2)) + Math.sqrt(Math.pow(angleA, 2));
    }
}
