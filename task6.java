// Напишите функцию, которая принимает на вход список целых чисел и
// возвращает новый список, содержащий только те числа, которые делятся на
// заданное число без остатка.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task6 {

    public static List<Integer> filterDivisible(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(number -> number % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 8, 10, 12, 15);
        int divisor = 3;

        List<Integer> result = filterDivisible(numbers, divisor);

        System.out.println(result);
    }
}