package latihan;

import java.util.Scanner;

public class tugas4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String barang;
        int jumlah, harga, a;
        int fee = 0;
        int b = 15000, c = 20000, d = 10000, e = 25000;
        String index;

        do {
            System.out.println("-----DAFTAR MENU-----");
            System.out.println("1.Bakso Urat ..........15000");
            System.out.println("2.Mie Ayam Bakso ......20000");
            System.out.println("3.Mie Ayam ............10000");
            System.out.println("4.Nasi + Ayam Geprek...25000");

            System.out.print("Siahkan pilih  Menu : ");
            a = input.nextInt();
            if (a == 1) {
                System.out.println("Makanan Yang Anda Pilih Bakso Urat Rp.: " + b);
                fee = fee + b;
            } else if (a == 2) {
                System.out.println("Makanan Yang Anda Pilih Mie Ayam Bakso Rp. : ");
                fee = fee + c;
            } else if (a == 3) {
                System.out.println("Makanan Yang Anda Pilih Mie Ayam  Rp. : ");
                fee = fee + d;
            } else if (a == 4) {
                System.out.println("Makanan Yang Anda Pilih Nasi + Ayam Geprek Rp. : ");
                fee = fee + e;
            } else {
                System.out.println("Selain Itu Makanan Tidak Tersedia");
            }

            System.out.print("Makanan Yang Di beli : ");
            barang = input.next();
            System.out.print("Harga Makanan : ");
            harga = input.nextInt();
            System.out.print("Jumlah Makanan : ");
            jumlah = input.nextInt();
            System.out.println("Total Yang Harus Di Bayar : " + (harga * jumlah));
            System.out.println("Ketik YA untuk Tambah Makanan");
            index = input.next();

        } while (index.toLowerCase().equals("ya"));
    }
}
