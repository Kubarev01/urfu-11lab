// Напишите функцию, которая принимает на вход список целых чисел и
// возвращает новый список, содержащий только те числа, которые больше
// заданного значения.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task8 {

    public static List<Integer> filterGreaterThan(List<Integer> numbers, int minValue) {
        return numbers.stream()
                .filter(number -> number > minValue)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 3, 12);
        int minValue = 5;

        List<Integer> result = filterGreaterThan(numbers, minValue);

        System.out.println(result);
    }
}