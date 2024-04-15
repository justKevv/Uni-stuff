package week8;

import net.datafaker.Faker;
import java.util.Scanner;
import java.util.Random;

public class MainBook {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StackBook st = new StackBook(8);
        Faker faker = new Faker();
        Random r = new Random();
        

        char choose = 't';
        int numbers = 0;
        do {
            Book bk = new Book(faker.book().title(), faker.book().author(), (1900 + r.nextInt(125)), r.nextInt(500),
                    r.nextInt(5000));
            System.out.println("Added random book " + (numbers + 1));
            numbers++;
            System.out.println("Do you want to add another book?");
            choose = sc.next().charAt(0);
            st.push(bk);
        } while (choose == 'y');

        st.print();
        st.pop();
        st.peek();
        st.print();
    }
}
