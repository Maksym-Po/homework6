package ua.ithillel.lms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] fruits = new String[10];
        fruits[0] = "яблоки";
        fruits[1] = "груши";
        fruits[2] = "сливы";
        fruits[3] = "персики";
        fruits[4] = "манго";
        fruits[5] = "бананы";
        fruits[6] = "айва";
        fruits[7] = "апельсины";
        fruits[8] = "мандарины";
        fruits[9] = "виноград";
        // первое задание
        String[] food = Arrays.copyOf(fruits, fruits.length);
        // второе задание
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
        //третье задание
        int[][] score = new int[3][4];
        score[0] = new int[]{10, 11, 12, 13};
        score[1] = new int[]{20, 21, 22, 23};
        score[2] = new int[]{30, 31, 32, 33};
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < score[0].length; i++) {
            a += score[0][i];
            b += score[1][i];
            c += score[2][i];
        }
        int[] result = {a, b, c};
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        //четвертое задание
    }
}
