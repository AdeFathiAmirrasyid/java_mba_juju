package review;

import java.util.Scanner;

public class tugas1_menentuanNilaiTerbesar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Program Menentukan Bilangan Terbesar Dan Terkecil ");
        System.out.print(" Angka ke - 1 = ");
        int angka1 = input.nextInt();
        System.out.print(" Angka ke - 2 = ");
        int angka2 = input.nextInt();
        System.out.print(" Angka ke - 3 = ");
        int angka3 = input.nextInt();
        System.out.print(" Angka ke - 4 = ");
        int angka4 = input.nextInt();

        int terbesar;
        int terkecil;
        if (angka1 > angka2 && angka1 > angka3) {
            terbesar = angka1;
        } else if (angka2 > angka3 && angka2 > angka4) {
            terbesar = angka2;
        } else if (angka3 > angka4 && angka3 > angka1) {
            terbesar = angka3;
        } else {
            terbesar = angka4;
        }

        if (angka1 < angka2 && angka1 < angka3) {
            terkecil = angka1;
        } else if (angka2 < angka3 && angka2 < angka4) {
            terkecil = angka2;
        } else if (angka3 < angka4) {
            terkecil = angka3;
        } else {
            terkecil = angka4;
        }
        System.out.println(" Nilai Terbesar = " + terbesar);
        System.out.println(" Nilai Terkecil = " + terkecil);
        int hasil = (angka1 + angka2 + angka3 + angka4) / 2;
        System.out.println(" Nilai Rata Rata = " + hasil);
        System.out.println(" program berakhir");
    }

}
