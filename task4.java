import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task4 {

    public static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = getSquares(numbers);

        System.out.println(result);
    }
}