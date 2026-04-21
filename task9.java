// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые содержат
// только буквы (без цифр и символов).

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task9 {

    public static List<String> filterOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(str -> str != null && str.matches("[a-zA-Zа-яА-Я]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Дом", "cat", "hello123", "Привет", "java!", "Мир");

        List<String> result = filterOnlyLetters(words);

        System.out.println(result);
    }
}