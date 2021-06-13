package belajar;

import java.util.Arrays;

public class matrix_penj_per {

    public static void main(String[] args) {

        int[][] a = {
            {4, 5, 2, 3, 2, 1},
            {5, 2, 7, 1, 2, 2},
            {9, 3, 6, 2, 4, 2},
            {3, 5, 7, 3, 8, 2},
            {4, 7, 6, 8, 2, 6}
        };
        int[][] b = {
            {1, 2, 2, 4},
            {3, 2, 1, 5},
            {2, 3, 4, 2},
            {1, 3, 1, 4},
            {1, 2, 1, 5},
            {1, 2, 4, 3}
        };
        int[][] c = new int[5][4];

        int[][] matriks_a = {
            {4, 5, 2, 3},
            {5, 2, 7, 1},
            {9, 3, 6, 2},
            {4, 7, 6, 8}};
        int[][] matriks_b = {
            {1, 2, 2, 3},
            {3, 2, 1, 1},
            {2, 3, 4, 2},
            {4, 1, 6, 2}};
        int[][] matriks_c = new int[4][4];

        penjumlahan(matriks_a , matriks_b,matriks_c);
        perkalian(a, b, c);

    }

    private static void penjumlahan(int a[][], int b [][] , int c[][]) {
        System.out.println("Menampilkan Matriks A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Menampilkan Matriks B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(" Hasil Penjumlahan ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = a[i][j] + b [i][j];
                System.out.print( c[i][j]+ " ");
            }
            System.out.println("");
        }

    }

    private static void perkalian(int [][] array1, int array2[][], int array3[][]) {
        System.out.println(" Menampilkan A");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(" Menampilkan B");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(" Hasil Perkalian");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
                System.out.print(array3[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static void printArray(int dataArray[][]) {
        System.out.println(Arrays.toString(dataArray));
    }
}
