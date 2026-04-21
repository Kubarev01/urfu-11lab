// Напишите функцию, которая принимает на вход два массива целых
// чисел и возвращает новый массив, содержащий только те элементы, которые
// есть в обоих массивах.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static int[] intersection(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            if (setA.contains(num)) {
                result.add(num);
            }
        }
        int[] answer = new int[result.size()];
        int i = 0;
        for (int num : result) {
            answer[i++] = num;
        }
        return answer;
    }
    public static void main(String[] args) {

        
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };
        int[] res = intersection(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
}