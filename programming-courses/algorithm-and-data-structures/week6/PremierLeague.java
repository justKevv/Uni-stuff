package week6;

public class PremierLeague {
    String team;
    int play, goal, points;

    PremierLeague(String t, int p, int g, int pt) {
        team = t;
        play = p;
        goal = g;
        points = pt;
    }

    void print() {
        System.out.printf("%-30s | %-10s | %-10s | %-10s%n", team, play, goal, points);
    }
}
