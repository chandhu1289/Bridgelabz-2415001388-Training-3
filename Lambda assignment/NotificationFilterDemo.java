import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    Alert(String type) { this.type = type; }
}

public class NotificationFilterDemo {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Normal"),
            new Alert("Critical"),
            new Alert("Emergency"),
            new Alert("Normal")
        );

        Predicate<Alert> criticalFilter = a -> a.type.equals("Critical");

        alerts.stream()
              .filter(criticalFilter)
              .forEach(a -> System.out.println("Alert: " + a.type));
    }
}
