import java.util.*;

public class Problem8Leaderboard {

    private TreeMap<Integer, String> leaderboard = new TreeMap<>(Collections.reverseOrder());

    public void addScore(String player, int score) {
        leaderboard.put(score, player);
    }

    public void displayTop() {

        System.out.println("Leaderboard:");

        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }
    }

    public static void main(String[] args) {

        Problem8Leaderboard game = new Problem8Leaderboard();

        game.addScore("Alice", 100);
        game.addScore("Bob", 150);
        game.addScore("Charlie", 120);

        game.displayTop();
    }
}