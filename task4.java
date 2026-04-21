import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task4 {

    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers) {
            result.add(num * num);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = getSquares(numbers);

        System.out.println(squares);
    }
}