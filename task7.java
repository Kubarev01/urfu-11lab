// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые имеют
// длину больше заданного значения.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task7 {

    public static List<String> filterByLength(List<String> strings, int minLength) {
        return strings.stream()
                .filter(str -> str != null && str.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("дом", "машина", "кот", "программирование", "лес");
        int minLength = 3;

        List<String> result = filterByLength(words, minLength);

        System.out.println(result);
    }
}