package week7;

public class Student extends Human {
    @Override
    public void eat() {
        System.out.println("Student eat");
    }

    void sleep() {
        System.out.println("Student sleep");
    }
}
