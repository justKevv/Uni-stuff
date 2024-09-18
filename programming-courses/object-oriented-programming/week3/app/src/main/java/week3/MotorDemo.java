package app.src.main.java.week3;

public class MotorDemo {
    public static void main(String[] args) {

        Motor motor = new Motor();
        motor.statusPrint();
        motor.increaseSpeed();

        motor.startEngine();
        motor.statusPrint();

        motor.increaseSpeed();
        motor.statusPrint();

        motor.increaseSpeed();
        motor.statusPrint();

        motor.increaseSpeed();
        motor.statusPrint();

        motor.stopEngine();
        motor.statusPrint();

    }
}
