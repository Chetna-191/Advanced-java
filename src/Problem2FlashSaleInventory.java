import java.util.*;

public class Problem2FlashSaleInventory {

    private HashMap<String, Integer> stock = new HashMap<>();
    private LinkedHashMap<Integer, String> waitingList = new LinkedHashMap<>();

    public Problem2FlashSaleInventory() {
        stock.put("IPHONE15", 100);
    }

    public void checkStock(String product) {
        System.out.println(stock.getOrDefault(product, 0) + " units available");
    }

    public synchronized void purchaseItem(String product, int userId) {
        int currentStock = stock.getOrDefault(product, 0);

        if (currentStock > 0) {
            stock.put(product, currentStock - 1);
            System.out.println("Purchase successful for user " + userId);
        } else {
            waitingList.put(userId, product);
            System.out.println("Added to waiting list");
        }
    }

    public static void main(String[] args) {
        Problem2FlashSaleInventory sale = new Problem2FlashSaleInventory();

        sale.checkStock("IPHONE15");
        sale.purchaseItem("IPHONE15", 101);
        sale.purchaseItem("IPHONE15", 102);
    }
}