package latihan;

import java.util.*;

class NewClass6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String satu, dua, tiga, empat, user;
        int jsatu, jdua, jtiga, jempat, total;
        int ksatu, kdua, ktiga, kempat;
        int uang, kembalian;

        do {
            // ini input si pembeli
            System.out.println("----------Aplikasi Penjualan----------");
            System.out.println(" Silahakan Pilih Barang Yang Anda Butuhkan ");
            System.out.print("Barang Ke 1        : ");
            satu = input.next();
            System.out.print("Jumlah Barang ke 1 : ");
            jsatu = input.nextInt();
            System.out.print("Barang Ke 2        : ");
            dua = input.next();
            System.out.print("Jumlah Barang ke 2 : ");
            jdua = input.nextInt();
            System.out.print("Barang Ke 3        : ");
            tiga = input.next();
            System.out.print("Jumlah Barang ke 3 : ");
            jtiga = input.nextInt();
            System.out.print("Barang Ke 4        : ");
            empat = input.next();
            System.out.print("Jumlah Barang ke 4 : ");
            jempat = input.nextInt();
            System.out.print("ketik Ya jika Ingin Mengulang Belanjaan : ");
            user = input.next();

        } while (user.toLowerCase().equals("ya"));

        //Input Kasir 
        do {
            System.out.println("-----Menghitung Belanjaan Yang Sudah Di Beli-----");
            System.out.print(satu + "  Harga : ");
            ksatu = input.nextInt();
            System.out.print(dua + "   Harga : ");
            kdua = input.nextInt();
            System.out.print(tiga + "  Harga : ");
            ktiga = input.nextInt();
            System.out.print(empat + " Harga : ");
            kempat = input.nextInt();
            System.out.print("ketik YA jika Ada kesalahan Harga : ");
            user = input.next();
        } while (user.toLowerCase().equals("ya"));
        // proses 
        System.out.println("");
        System.out.println("");
        total = ((jsatu * ksatu) + (jdua * kdua) + (jtiga * ktiga) + (jempat * kempat));
        System.out.println("=====total belanja = " + total + "=====");
        System.out.println("==================================");
        System.out.println("");
        // customer/pembeli
        do {
            System.out.print("Uang anda sebesar Rp : ");
            uang = input.nextInt();
            kembalian = (uang - total);
            if (uang > total) {
                System.out.println("Kembalian uang Anda Sebesar Rp : " + kembalian);
            } else if (uang == total) {
                System.out.println("Uang Anda Pas Rp : " + kembalian);
            } else {
                System.out.println("Uang Anda Kurang Sebesar Rp : " + kembalian);
            }
            System.out.print("ketik YA jika Uang Anda Kurang : ");
            user = input.next();
        } while (user.toLowerCase().equals("ya"));

        System.out.println("----------Program Berakhir----------");
    }

}
