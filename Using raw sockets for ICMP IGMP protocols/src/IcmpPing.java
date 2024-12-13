import java.net.InetAddress;

public class IcmpPing {
    public static void main(String[] args) {
        try {
            String host = "8.8.8.8";
            InetAddress inet = InetAddress.getByName(host);

            System.out.println("Перевіряємо доступність хоста: " + host);

            boolean reachable = inet.isReachable(5000);

            if (reachable) {
                System.out.println("Хост " + host + " доступний!");
            } else {
                System.out.println("Хост " + host + " недоступний.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}