//Напишите функцию, которая принимает на вход массив целых чисел и
//возвращает новый массив, содержащий только четные числа из исходного
//массива.

import java.util.Arrays;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] evenArray = getEvenArray(arr);
        System.out.println("Массив четных чисел: " + Arrays.toString(evenArray));
        scanner.close();
    }

    public static int[] getEvenArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] evenArray = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[index] = arr[i];
                index++;
            }
        }
        return evenArray;
    }
}