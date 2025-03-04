import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var evens = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(t -> t % 2 != 0)
                .toList();



    }
}