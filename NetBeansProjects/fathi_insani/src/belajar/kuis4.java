package belajar;

import java.util.Arrays;

public class kuis4 {

    public static void main(String[] args) {

        soal1();
        System.out.println("");
        matriks();
        System.out.println("");
        int max = 0;
        int min = 1;
        int rata= 0;
        int hasil = printArray(max,min,rata);
    }
    private static void soal1() {
        for (int i = -6; i <= 32; i++) {
            i += 4;
            System.out.print(i - 1 + " ");
        }
        System.out.println("");
    }

    private static int printArray(int max, int min ,int rata) {
        int jumlah = 0;
        int array [] = {2,5,3,7,1,4,6};
        for (int i = array.length -1 ; i >= 0; i--) {
            Arrays.sort(array);
            System.out.print(array[i] + " ");  
            if (max < array[i]) {
                max = array[i];
            } else if (min > array [i] ){
                min = array[i];
            }  
             jumlah += array[i];
             rata = jumlah / 7;
        }
        System.out.println("");
        System.out.println(" Terbesar     = " + max); 
        System.out.println(" Terkecil     = " + min );
        System.out.println(" Jumlah Array = " + jumlah);
        System.out.println(" Rata - Rata  = " + rata);
        return max ;
    }

    private static void matriks() {
        int array[][] = {
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8, 0},
            {3, 5, 7, 9, 1},
            {2, 5, 8, 1, 3}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println(" A ");
        for (int i = 3; i >= 0; i--) {
            for (int j = 4; j >= 2; j--) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println(" B ");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 1 || i == 3) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println(" C ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(array[i][j] * 2 + " ");

            }
            System.out.println("");
        }

    }
}
