// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые начинаются
// с большой буквы.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {

    public static List<String> filterUppercase(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str != null && !str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Москва", "река", "Дом", "машина", "Солнце");

        List<String> result = filterUppercase(words);

        System.out.println(result);
    }
}