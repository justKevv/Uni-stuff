package week10;

import java.util.Scanner;

public class CinemaWithScanner14 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];
        Scanner scanner = new Scanner(System.in);

        int row, column;
        String name, next;
        int menuChoice;

        while (true) {
            System.out.println("Menu Options:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("Enter a name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter a row number: ");
                    row = scanner.nextInt();
                    System.out.println("Enter a column number: ");
                    column = scanner.nextInt();
                    scanner.nextLine();

                    if (audience[row][column] != null) {
                        System.out
                                .println("Warning: The selected seat is already occupied. Please choose another seat.");
                        break; // Exit the switch statement and go back to the menu
                    }

                    // Check if the row and column numbers are within the valid range
                    if (row >= 0 && row < audience.length && column >= 0 && column < audience[0].length) {
                        // Assign the name to the specified seat
                        audience[row][column] = name;
                        System.out.println("Data input successful!");
                    } else {
                        System.out.println("Invalid row or column number. Please try again.");
                    }

                    break;

                case 2:
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                audience[i][j] = "***";
                            }
                        }
                    }
                    // Print the audience list
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            System.out.print(audience[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Exit the program
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
