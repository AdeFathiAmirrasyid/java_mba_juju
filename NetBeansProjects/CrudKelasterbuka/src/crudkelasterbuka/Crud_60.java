package crudkelasterbuka;

import java.util.Scanner;

public class Crud_60 {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String ulangi;
        int user;
        do {
            System.out.println(" 1. Lihat Seluruh Buku ");
            System.out.println(" 2. Cari Data BUku ");
            System.out.println(" 3. Tambah Data Buku ");
            System.out.println(" 4. Ubah Data BUku ");
            System.out.println(" 5. Hapus Data Buku \n");
            

            System.out.print(" Pilihan Anda : ");
            user = inputUser.nextInt();
            switch (user) {
                case 1:
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    break;
                case 2:
                    System.out.println("\n==============");
                    System.out.println("CARI DATA BUKU");
                    System.out.println("==============");
                    break;
                case 3:
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    break;
                case 4:
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    break;
                case 5:
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    break;
                default:
                    System.err.println("Input anda tidak ditemukan \n Silahkan Pilih [1-5]");
            }
            System.out.print(" Apakah Anda Mau Melanjutkan (y/n)?");
            ulangi = inputUser.next();
        } while (ulangi.toLowerCase().equals("y"));

    }

}
