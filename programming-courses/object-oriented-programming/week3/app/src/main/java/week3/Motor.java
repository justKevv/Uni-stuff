package app.src.main.java.week3;

public class Motor {
    private int speed = 0;
    private boolean motorOn = false;

    void startEngine() {
        motorOn = true;
    }

    void stopEngine() {
        motorOn = false;
        speed = 0;
    }

    void increaseSpeed() {
        if (motorOn) {
            if (speed + 5 <= 100) {
                speed += 5;
            } else {
                speed = 100; // Setting max speed to 100
            }
            System.out.println("Current speed: " + speed);
        } else {
            System.out.println("Speed cannot increase because the engine is off!");
        }
    }

    void decreaseSpeed() {
        if (motorOn) {
            speed -= 5;
        } else {
            System.out.println("Motorcycle is off");
        }
    }

    void statusPrint() {
        if (motorOn) {
            System.out.println("Motorcycle is on");
        } else {
            System.out.println("Motorcycle is off");
        }

        System.out.println("Speed: " + speed);
    }
}
