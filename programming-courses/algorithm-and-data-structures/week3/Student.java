package week3;

public class Student {
    String name, nim, gender;
    double gpa;

    void print(int i) {
        System.out.println(i + " Student Data");
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    double calculateAverage(Student[] students) {
        double total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i].gpa;
        }
        return total / students.length;
    }

    double findHighestGpa(Student[] students) {
        double highest = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].gpa > highest) {
                highest = students[i].gpa;
            }
        }
        return highest;
    }
}
