import java.util.*;

public class Problem6RateLimiter {

    private HashMap<String, Integer> requestCount = new HashMap<>();
    private int LIMIT = 5;

    public boolean allowRequest(String user) {

        int count = requestCount.getOrDefault(user, 0);

        if (count < LIMIT) {
            requestCount.put(user, count + 1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Problem6RateLimiter limiter = new Problem6RateLimiter();

        String user = "user1";

        for (int i = 1; i <= 7; i++) {

            if (limiter.allowRequest(user))
                System.out.println("Request " + i + " Allowed");
            else
                System.out.println("Request " + i + " Blocked");
        }
    }
}
