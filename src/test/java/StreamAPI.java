
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamAPI {

    public static List<Integer> numbers;
    public static List<String> surnames = new ArrayList<>();
    public static Random random = new Random();

    public static void main(String[] args) {
        numbers = random
                .ints(5, -100, 100)
                .boxed()
                .collect(Collectors.toList());

        surnames.add("Johnson");
        surnames.add("Andersen");
        surnames.add("Thomas");
        surnames.add("Allen");
        surnames.add("Hill");

        System.out.println("Init numbers list" + numbers);

        System.out.println("Create positive numbers function result");
        System.out.println(createPositiveNumbers(numbers));

        System.out.println("Change even and odd numbers result");
        System.out.println(evenMultiplyOddSubtract(numbers));

        System.out.println("Init surnames list" + surnames);
        System.out.println("Find all surnames started with \"A\" result");
        System.out.println(findSurname(surnames));
    }

    public static List<Integer> createPositiveNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> {
                            if (number < 0) {
                                return number * -1;
                            } else {
                                return number;
                            }
                        }
                )
                .collect(Collectors.toList());

    }

    public static List<Integer> evenMultiplyOddSubtract(List<Integer> numbers) {
        return numbers
                .stream()
                .map(number -> {
                            if (number % 2 == 0) {
                                return number * 100;
                            } else {
                                return number - 100;
                            }
                        }
                )
                .collect(Collectors.toList());
    }

    public static List<String> findSurname(List<String> surnames) {
        return surnames.stream()
                .filter(surname -> surname.startsWith("A"))
                .collect(Collectors.toList());
    }

}