// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые содержат
// заданную подстроку.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task5 {

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(str -> str != null && str.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("машина", "дом", "домик", "река", "домовой");
        String substring = "дом";

        List<String> result = filterBySubstring(words, substring);

        System.out.println(result);
    }
}