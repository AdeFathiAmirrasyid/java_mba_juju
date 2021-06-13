package review;

import java.util.Scanner;

public class tugas4_programKasir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Program Kasir ");
        String user, ulangi;
        int harga, total = 0, jumlah;
        int i = 0;
        do {
            do {
                i++;
                System.out.print(" Masukan Barang ke - " + i + " : ");
                user = input.next();
                System.out.print(" Masukan Jumlah Barang : ");
                jumlah = input.nextInt();
                System.out.print(" Masukan Harga Barang ke - " + i + " : ");
                harga = input.nextInt();
                total += jumlah * harga;
            } while (i < 3);
            System.out.println(" jumlah yang harus di bayar = " + total);
            System.out.print(" ketik ya jika ingin menambah barang : ");
            ulangi = input.next();
        } while (ulangi.toLowerCase().equals("ya"));

    }

}
