// Напишите функцию, которая принимает на вход список целых чисел и
// возвращает новый список, содержащий только те числа, которые делятся на
// заданное число без остатка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task6 {

    public static List<Integer> filterDivisible(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 8, 10, 12, 15, 20);
        int divisor = 5;

        List<Integer> result = filterDivisible(numbers, divisor);

        System.out.println(result);
    }
}