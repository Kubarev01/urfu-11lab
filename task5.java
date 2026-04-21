// Напишите функцию, которая принимает на вход список строк и
// возвращает новый список, содержащий только те строки, которые содержат
// заданную подстроку.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task5 {

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str != null && str.contains(substring)) {
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("машина", "дом", "домик", "река", "домовой");
        String substring = "дом";

        List<String> result = filterBySubstring(words, substring);

        System.out.println(result);
    }
}