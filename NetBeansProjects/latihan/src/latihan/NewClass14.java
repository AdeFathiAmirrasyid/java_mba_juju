package latihan;

import java.util.Scanner;

public class NewClass14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        do {
            System.out.print(" Masukan Jumlah Baris (minimal 1 ) : ");
            row = input.nextInt();
            System.out.print(" Masukan Jumlah Kolom (minimal 1) : ");
            col = input.nextInt();

        } while (row <= 0 && col <= 0);
        int angka[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" col - " + i + j + " : ");
                angka[i][j] = input.nextInt();
            }
        }

        double rata, min, max, total = 0;
        min = angka[0][0];
        max = angka[0][0];

        System.out.print(" Angka Yang Di Inputkan : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(angka[i][j] + " , ");
                total = total + angka[i][j];
                if (angka[i][j] < min) {
                    min = angka[i][j];
                } else if (angka[i][j] > max) {
                    max = angka[i][j];
                }
            }
        }
        rata = total / (row*col);
        System.out.println("\n   Hasil Nilai Total       : " + total);
        System.out.println("   Hasil Nilai Rata - Rata : " + rata);
        System.out.println("   Hasil Nilai Maximal     : " + max);
        System.out.println("   Hasil Nilai Minimal     : " + min);
    }
}
