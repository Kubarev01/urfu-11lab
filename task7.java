// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые имеют
// длину больше заданного значения.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task7 {

    public static List<String> filterByLength(List<String> strings, int minLength) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.length() > minLength) {
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("дом", "машина", "кот", "программирование", "лес");
        int minLength = 3;

        List<String> result = filterByLength(words, minLength);

        System.out.println(result);
    }
}