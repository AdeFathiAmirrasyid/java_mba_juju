package latihan;

import java.util.Scanner;

public class NewClass9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angsuran, hp;
        String ulangi, minjam, nama, peker;
        double pinjam = 0, bunga, total, besar;

        System.out.println("  ---------- PEMINJAMAN UANG ----------");
        System.out.println(" Syarat Meminjam Uang Harus Mengisi Formulir ");
        System.out.print(" Ketik Ya Jika Ingin Meminjam Uang : ");
        minjam = input.next();
        while (minjam.toLowerCase().equals("ya")) {
            System.out.print(" Nama         : ");
            nama = input.next();
            System.out.print(" No HP aktif  : ");
            hp = input.nextInt();
            System.out.print(" Pekerjaan    : ");
            peker = input.next();
        
            System.out.println("---------- KETENTUAN PINJAMAN -----------");
            System.out.println("1. Rp.100.000    -  3.000.000 Dengan Bunga 20% ");
            System.out.println("2. Rp.4.000.000  -  7.000.000 Dengan Bunga 25% ");
            System.out.println("3. Rp.8.000.000  - 11.000.000 Dengan Bunga 30% ");
            System.out.println("4. Rp.12.000.000 - 15.000.000 Dengan Bunga 35% ");
            System.out.println("");
            do {
                System.out.print(" Pinjam Uang Sebesar : Rp.");
                pinjam = input.nextDouble();
                System.out.print(" Angsuran Berapa (bulan) : ");
                angsuran = input.nextInt();
                if ((pinjam >= 100000) && (pinjam <= 3000000)) {
                    bunga = (pinjam * 0.2);
                    total = pinjam + bunga;
                    besar = total / angsuran;
                    System.out.println("Uang Yang Anda Pinjam : Rp. " + pinjam);
                    System.out.println("Angsuran (Bulan) : " + besar + " plus sudah termasuk Bunga ");
                } else if ((pinjam >= 4000000) && (pinjam <= 7000000)) {
                    bunga = (pinjam * 0.25);
                    total = pinjam + bunga;
                    besar = total / angsuran;
                    System.out.println("Uang Yang Anda Pinjam : Rp. " + pinjam);
                    System.out.println("Angsuran (Bulan) : " + besar + " plus sudah termasuk Bunga ");
                } else if ((pinjam >= 8000000) && pinjam <= 11000000) {
                    bunga = (pinjam * 0.3);
                    total = pinjam + bunga;
                    besar = total / angsuran;
                    System.out.println("Uang Yang Anda Pinjam : Rp. " + pinjam);
                    System.out.println("Angsuran (Bulan) : " + besar + " plus sudah termasuk Bunga ");
                } else if ((pinjam >= 12000000) && (pinjam <= 15000000)) {
                    bunga = (pinjam * 0.35);
                    total = pinjam + bunga;
                    besar = total / angsuran;
                    System.out.println("Uang Yang Anda Pinjam : Rp. " + pinjam);
                    System.out.println("Angsuran (Bulan) : " + besar + " plus sudah termasuk Bunga ");
                } else {
                    System.out.println("Selain itu tidak ada ");
                }
                System.out.print("ketik ya jika ingin meminjam lagi : ");
                ulangi = input.next();
            } while (ulangi.toLowerCase().equals("ya"));

            System.out.println("");
            System.out.print("Ketik Ya Jika Ingin Mengembalikan  : ");
            minjam = input.next();
            while (minjam.toLowerCase().equals("ya")) {

                System.out.print(" Nama         : ");
                String nama1 = input.next();
                System.out.print(" No HP aktif  : ");
                int hp1 = input.nextInt();
                System.out.print(" Pekerjaan    : ");
                String peker1 = input.next();

                if (nama.toLowerCase().equals(nama1) && hp == hp1 && peker.toLowerCase().equals(peker1)) {
                    System.out.println(" Identitas falid ");
                    System.out.println(" Pengembalian Sukses ");
                   break;
                } else {
                    System.out.println(" Identitas tidak falid ");
                    break;
                }
            }
            break;
        }
        System.out.println("      ----- Program Berakhir -----");

    }

}
