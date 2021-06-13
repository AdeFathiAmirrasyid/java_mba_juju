package latihan;

import java.util.Scanner;

public class NewClass11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Array / Berapa Kali Input: ");
        int panjangArray = input.nextInt();

        int angka[] = new int[panjangArray];
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Masukkan angka ke - " + i + " : ");
            angka[i] = input.nextInt();
        }

        float min, max, rata, total = 0;
        min = angka[0];
        max = angka[0];

        System.out.print(" angka yang di inputkan adalah : ");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print(angka[i] + ", ");
            total = total + angka[i];

            if (angka[i] < min) {
                min = angka[i];
            } else if (angka[i] > max) {
                max = angka[i];
            }
        }
        rata = total / panjangArray;
        System.out.println(" \n Rata - Rata " + rata);
        System.out.println(" Nilai Terkecilnya adalah : " + min + "\nNilai Terbesarnya adalah :" + max);
    }
}
