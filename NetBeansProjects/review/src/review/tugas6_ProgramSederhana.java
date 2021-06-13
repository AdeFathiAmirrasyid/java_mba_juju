package review;

import java.util.Scanner;

public class tugas6_ProgramSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama1 = " ", nama2 = " ", user;
        double pinjam1 = 0, pinjam2 = 0, bulan1 = 0, tglMinjam = 0, tgl = 0, hasil;
        double bunga = 0.2;
        System.out.println(" Program  Peminjaman Uang Dengan Bunga 20% ");
        do {
            System.out.print(" Ketik Ya jika Ingin Meminjam Uang : ");
            user = input.next();

            if (user.toLowerCase().equals("ya")) {
                System.out.println(" Isi Formulir Berikut ");
                System.out.print(" Nama : ");
                nama1 = input.next();
                System.out.print(" jumlah Pinjaman Rp. ");
                pinjam1 = input.nextDouble();
                System.out.print(" Lama Meminjam : ");
                bulan1 = input.nextDouble();
                System.out.print(" Tanggal Meminjam : ");
                tglMinjam = input.nextDouble();

                System.out.println(" Ketik Ya jika Ingin Mengembalikan : ");
                user = input.next();
                if (user.toLowerCase().equals("ya")) {
                    System.out.println(" Isi Formulir Berikut ");
                    System.out.print(" Nama : ");
                    nama2 = input.next();
                    System.out.print(" Jumlah Pengembalian Rp. ");
                    pinjam2 = input.nextDouble();
                    System.out.print(" Tanggal Mengembalikan : ");
                    tgl = input.nextDouble();

                }
            }
            System.out.println(" ketik ulangi jika Data ada yang salah ");
            user = input.next();
        } while (user.toLowerCase().equals("ya"));
        if (nama1.toLowerCase().equals(nama2) & (pinjam1 == pinjam2)) {
            System.out.println(" Data Falid ");
            System.out.println(" Nama : " + nama2);
            System.out.println(" Jumlah Pinjaman Rp. " + pinjam2);
            hasil = bunga * pinjam2;
            hasil += pinjam2;
            System.out.println(" jumlah yang harus di bayar  " + hasil + " dengan bunga 20%");
        } else if (nama1.toLowerCase().equals(nama2) & (pinjam1 == pinjam2)) {
            System.out.println(" Data Falid ");
            System.out.println(" Nama : " + nama2);
            System.out.println(" Jumlah Pinjaman Rp. " + pinjam2);
            hasil = bunga * pinjam2;
            hasil += pinjam2;
            double telat = tgl - tglMinjam;
            System.out.println(" Anda Membayarnya Telat " +telat+" Hari " );
            System.out.println(" Anda Telah Jatuh Tempo Dan PembayaranNya melebihi batas  " + hasil + " dengan bunga 20%");
        } else {
            System.out.println(" Data Tidak Falid ");

        }

    }

}
