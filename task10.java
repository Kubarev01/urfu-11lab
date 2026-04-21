// Напишите функцию, которая принимает на вход список целых чисел и
// возвращает новый список, содержащий только те числа, которые меньше
// заданного значения.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task10 {

    public static List<Integer> filterLessThan(List<Integer> numbers, int maxValue) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number < maxValue) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 3, 12);
        int maxValue = 8;

        List<Integer> result = filterLessThan(numbers, maxValue);

        System.out.println(result);
    }
}