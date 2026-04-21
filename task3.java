// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые начинаются
// с большой буквы.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task3 {

    public static List<String> filterUppercase(List<String> strings) {
        return strings.stream()
                .filter(str -> str != null && !str.isEmpty() && Character.isUpperCase(str.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Москва", "река", "Дом", "машина", "Солнце");

        List<String> result = filterUppercase(words);

        System.out.println(result);
    }
}