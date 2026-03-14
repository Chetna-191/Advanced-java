import java.util.*;

public class Problem9NotificationQueue {

    private Queue<String> queue = new LinkedList<>();

    public void sendNotification(String msg) {
        queue.add(msg);
    }

    public void processNotification() {

        while (!queue.isEmpty()) {
            System.out.println("Sending: " + queue.poll());
        }
    }

    public static void main(String[] args) {

        Problem9NotificationQueue n = new Problem9NotificationQueue();

        n.sendNotification("Order Placed");
        n.sendNotification("Payment Successful");
        n.sendNotification("Order Shipped");

        n.processNotification();
    }
}
