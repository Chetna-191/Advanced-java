import java.util.*;

public class Problem10URLShortener {

    private HashMap<String, String> map = new HashMap<>();
    private int id = 0;

    public String shortenURL(String url) {

        String shortURL = "short.ly/" + id++;
        map.put(shortURL, url);

        return shortURL;
    }

    public String getOriginalURL(String shortURL) {
        return map.get(shortURL);
    }

    public static void main(String[] args) {

        Problem10URLShortener service = new Problem10URLShortener();

        String shortUrl = service.shortenURL("https://google.com");

        System.out.println("Short URL: " + shortUrl);
        System.out.println("Original URL: " + service.getOriginalURL(shortUrl));
    }
}