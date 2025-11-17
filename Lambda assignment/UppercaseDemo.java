import java.util.*;

public class UppercaseDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ravi", "sita", "john");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
