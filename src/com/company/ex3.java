package com.company;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: "); //пользователь должен понимать, что от него хочет программа ;)
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        arr = inputArray(arr);
        outputArray(arr);
    }

    private static void outputArray(int[] arr) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static int[] inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + i + "-й элемент массива: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}