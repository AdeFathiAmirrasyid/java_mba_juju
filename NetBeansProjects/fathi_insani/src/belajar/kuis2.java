package belajar;

import java.util.Scanner;

public class kuis2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Masukan Nilai : ");
        int nilai = input.nextInt();
        if (nilai >= 85 && nilai <= 100) {
            System.out.println(" Nilai A ");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println(" Nilai B ");
        } else if (nilai >= 50 && nilai <= 69) {
            System.out.println(" Nilai C ");
        } else if (nilai >= 1 && nilai <= 49) {
            System.out.println(" Nilai D ");
        } else if (nilai == 0) {
            System.out.println(" Nilai E ");
        }else {
            System.out.println(" Selain Itu salah");
        }
        System.out.println(" Program Selesai ");
    }

}
