package belajar;

import java.util.Arrays;

public class NewClass2 {

    public static void main(String[] args) {
        int[][] array = {
            {10, 20, 30, 40, 50},
            {15, 25, 35, 45, 55},
            {60, 70, 80, 90, 100},
            {65, 75, 85, 95, 105},};
        tampilkan(array);
    }

    private static void tampilkan(int array[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i < 4 - 1; i++) {
            for (int j = 1; j < 5 - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= j) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

    private static void printArray(int dataArray[][]) {
        System.out.println(Arrays.toString(dataArray));
    }
}
