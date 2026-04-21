// Напишите функцию, которая принимает на вход два массива целых
// чисел и возвращает новый массив, содержащий только те элементы, которые
// есть в обоих массивах.

import java.util.Arrays;

public class task2 {

    public static int[] intersection(int[] a, int[] b) {
        return Arrays.stream(a)
                .distinct()
                .filter(x -> Arrays.stream(b).anyMatch(y -> y == x))
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int[] result = intersection(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}