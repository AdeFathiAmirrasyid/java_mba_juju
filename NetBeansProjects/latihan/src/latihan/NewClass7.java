package latihan;

import java.util.*;

public class NewClass7 {

    public static void main(String[] args) {

        String user, cek, menu;
        int pilih, nabung, ambil, saldo = 2000000, total;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("===== TABUNGAN =====");
            System.out.println("Masukan Pin Dengan Benar ");

            System.out.print("Password   : ");
            user = input.next();
            if (user.toLowerCase().equals("sandi") & user.toLowerCase().equals("sandi")) {
               
            } else {
                System.out.println(" sandi yang anda masukan salah ");
            }
            while (user.toLowerCase().equals("sandi")) {
                System.out.println("===== MENU TABUNGAN =====");
                System.out.println("1. MENABUNG   ");
                System.out.println("2. AMBIL UANG ");
                System.out.println("3. CEK SALDO  ");
                System.out.print("Pilih Salah Satu Menu Tabungan : ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("===== MENABUNG =====");
                        System.out.print("Menabung Membangun Masa Depan,Mau Menabung Berapa : ");
                        nabung = input.nextInt();
                        System.out.println("Proses Menabung Anda Barhasil");
                        total = nabung + saldo;
                        System.out.println("Saldo  Sebelumnya  Rp. " + saldo);
                        System.out.println("Saldo  Sesudahnya Mengisi  Rp. " + total);
                        break;
                    case 2:
                        System.out.println("===== AMBIL UANG =====");
                        System.out.print("Mau Mengambil Uang Berapa : ");
                        ambil = input.nextInt();
                        System.out.println("Proses Mengambil Uang Berhasil");
                        total = saldo - ambil;
                        System.out.println("Saldo  Sebelumnya  Rp. " + saldo);
                        System.out.println("Saldo  Sesudah Diambil  Rp. " + total);
                        break;

                    case 3:
                        System.out.println("===== CEK SALDO =====");
                        System.out.print("ketik YA jika mau cek saldo anda : ");
                        cek = input.next();
                        while (cek.toLowerCase().equals("ya")) {
                            System.out.println("Saldo Anda Sekarang Rp." + saldo);
                            break;
                        }
                        break;
                    default:
                        System.out.println("Selain itu tidak ada ");
                        break;
                }
                break;
            }
            System.out.print("ketik YA jika mau kembali ke menu utama : ");
            menu = input.next();
        } while (menu.toLowerCase().equals("ya"));
        System.out.println("========== Program Berakhir ==========");

    }

}
