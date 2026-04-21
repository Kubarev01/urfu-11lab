// Напишите функцию, которая принимает на вход список целых чисел и
// возвращает новый список, содержащий только те числа, которые меньше
// заданного значения.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task10 {

    public static List<Integer> filterLessThan(List<Integer> numbers, int maxValue) {
        return numbers.stream()
                .filter(number -> number < maxValue)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 3, 12);
        int maxValue = 8;

        List<Integer> result = filterLessThan(numbers, maxValue);

        System.out.println(result);
    }
}