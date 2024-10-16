package week7;

public class HumanMain {
    public static void main(String[] args) {
        Human human1 = new Lecturer();
        Human human2 = new Student();

        // Dynamic method dispatch in action
        human1.breathe();
        human1.eat(); // Will call Lecture's eat()

        human2.breathe();
        human2.eat(); // Will call Student's eat()

        // To call subclass-specific methods, we need to cast the objects
        if (human1 instanceof Lecturer) {
            ((Lecturer) human1).overtime();
        }

        if (human2 instanceof Student) {
            ((Student) human2).sleep();
        }
    }
}
