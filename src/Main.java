import java.util.*;

public class Problem4PlagiarismDetector {

    public static Set<String> generateNGrams(String text, int n) {

        String[] words = text.split(" ");
        Set<String> ngrams = new HashSet<>();

        for (int i = 0; i <= words.length - n; i++) {
            String gram = "";
            for (int j = 0; j < n; j++) {
                gram += words[i + j] + " ";
            }
            ngrams.add(gram.trim());
        }

        return ngrams;
    }

    public static void main(String[] args) {

        String doc1 = "machine learning is fun and powerful";
        String doc2 = "machine learning is fun and easy";

        Set<String> n1 = generateNGrams(doc1, 3);
        Set<String> n2 = generateNGrams(doc2, 3);

        n1.retainAll(n2);

        System.out.println("Matching n-grams: " + n1.size());
    }
