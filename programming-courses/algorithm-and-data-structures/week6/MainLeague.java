package week6;

import java.util.Random;
import java.util.Scanner;

public class MainLeague {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Random r = new Random();
        String[] teams = {
                "Liverpool",
                "Luton Town",
                "Chelsea",
                "Bournemouth",
                "Nottingham Forest",
                "Brighton & Hove Albion",
                "Fulham",
                "Manchester United",
                "Brentford",
                "Arsenal",
                "Aston Villa",
                "Manchester City",
                "Sheffield United",
                "Newcastle United",
                "Crystal Palace",
                "Burnley",
                "Everton",
                "West Ham United",
                "Wolverhampton",
                "Tottenham Hotspur"
        };
        PremierLeagueService data = new PremierLeagueService();

        for (int i = 0; i < data.leagues.length; i++) {
            int play = r.nextInt(29, 31);
            int goal = r.nextInt(-50, 50);
            int points = r.nextInt(10, 70);

            PremierLeague team = new PremierLeague(teams[i], play, goal, points);
            data.add(team);
        }
        System.out.printf("%-30s | %-10s | %-10s | %-10s%n", "Team", "P", "GD", "PTS");
        data.displayAll();
        System.out.println("+--------------------------------+");
        System.out.print("Sort Points by: 1. Ascending 2. Descending: ");
        int choice = sc.nextInt();
        data.insertionSort(
            choice == 1 ? true : false
        );

        data.displayAll();
    }
}
