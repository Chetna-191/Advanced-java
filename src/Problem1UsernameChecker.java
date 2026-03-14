import java.util.*;

public class Problem1UsernameChecker {

    private HashMap<String, Integer> usernameMap = new HashMap<>();
    private HashMap<String, Integer> attemptFrequency = new HashMap<>();

    public Problem1UsernameChecker() {
        usernameMap.put("john_doe", 1);
        usernameMap.put("admin", 2);
    }

    public boolean checkAvailability(String username) {
        attemptFrequency.put(username, attemptFrequency.getOrDefault(username, 0) + 1);
        return !usernameMap.containsKey(username);
    }

    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            suggestions.add(username + i);
        }
        suggestions.add(username.replace("_", "."));
        return suggestions;
    }

    public String getMostAttempted() {
        String maxUser = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : attemptFrequency.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxUser = entry.getKey();
            }
        }

        return maxUser + " (" + max + " attempts)";
    }

    public static void main(String[] args) {
        Problem1UsernameChecker system = new Problem1UsernameChecker();

        System.out.println(system.checkAvailability("john_doe"));
        System.out.println(system.checkAvailability("jane_smith"));
        System.out.println(system.suggestAlternatives("john_doe"));
        System.out.println(system.getMostAttempted());
    }
}