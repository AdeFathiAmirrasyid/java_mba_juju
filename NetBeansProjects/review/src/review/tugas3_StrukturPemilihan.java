package review;

import java.util.Scanner;

public class tugas3_StrukturPemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("  Struktur Pemilihan ");
        System.out.println(" ----- Pilih Merk Handphone ----- ");
        System.out.println(" 1. OPPO        2. SAMSUNG ");
        System.out.println(" 3. VIVO        4. REALME  ");
        System.out.print(" Merk Hp : ");
        int hp = input.nextInt();
        switch (hp) {
            case 1:
                System.out.println(" ----- Merk OPPO ----- ");
                System.out.println(" 1. Garansi         2. Spesifikasi");
                System.out.print(" ketik 1 atau 2  : ");
                int oppo = input.nextInt();
                if (oppo == 1) {
                    System.out.println(" Garansi Hp OPPO adalah 2 tahun ");
                } else if (oppo == 2) {
                    System.out.println(" Spesivikasi OPPO ");
                    System.out.println(" RAM 20 GB ROM 500 GB");
                    System.out.println(" LCD Super AMOLED");
                } else {
                    System.out.println(" Selain Itu Tidak Ada ");
                }
                break;
            case 2:
                System.out.println(" ----- Merk SAMSUNG ----- ");
                System.out.println(" 1. Garansi         2. Spesifikasi");
                System.out.print(" ketik 1 atau 2  : ");
                int samsung = input.nextInt();
                if (samsung == 1) {
                    System.out.println(" Garansi Hp SAMSUNG adalah 2 tahun ");
                } else if (samsung == 2) {
                    System.out.println(" Spesivikasi SAMSUNG ");
                    System.out.println(" RAM 20 GB ROM 500 GB");
                    System.out.println(" LCD Super AMOLED");
                } else {
                    System.out.println(" Selain Itu Tidak Ada ");
                }
                break;
            case 3:
                System.out.println(" ----- Merk VIVO ----- ");
                System.out.println(" 1. Garansi         2. Spesifikasi");
                System.out.print(" ketik 1 atau 2  : ");
                int vivo = input.nextInt();
                if (vivo == 1) {
                    System.out.println(" Garansi Hp VIVO adalah 2 tahun ");
                } else if (vivo == 2) {
                    System.out.println(" Spesivikasi VIVO ");
                    System.out.println(" RAM 20 GB ROM 500 GB");
                    System.out.println(" LCD Super AMOLED");
                } else {
                    System.out.println(" Selain Itu Tidak Ada ");
                }
                break;
            case 4:
                System.out.println(" ----- Merk REALME ----- ");
                System.out.println(" 1. Garansi         2. Spesifikasi");
                System.out.print(" ketik 1 atau 2  : ");
                int realme = input.nextInt();
                if (realme == 1) {
                    System.out.println(" Garansi Hp REALME adalah 2 tahun ");
                } else if (realme == 2) {
                    System.out.println(" Spesivikasi REALME ");
                    System.out.println(" RAM 20 GB ROM 500 GB");
                    System.out.println(" LCD Super AMOLED");
                } else {
                    System.out.println(" Selain Itu Tidak Ada ");
                }
                break;
            default:
                System.out.println(" Selain itu tidak Ada ");
                break;
        }
    }
}
