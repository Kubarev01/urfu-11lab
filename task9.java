// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые содержат
// только буквы (без цифр и символов).

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task9 {

    public static List<String> filterOnlyLetters(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.matches("[a-zA-Zа-яА-Я]+")) {
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Дом", "cat", "hello123", "Привет", "java!", "Мир");

        List<String> result = filterOnlyLetters(words);

        System.out.println(result);
    }
}