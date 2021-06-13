package fathi_insani;

import java.util.*;

public class NewClass {

    public static void main(String[] args) {

        String pinjam;
        String  nama = "", merk = "", plat = "", pin = "";
        int waktu, kemb, tgl, total, denda,td;

        int user;

        Scanner input = new Scanner(System.in);
        System.out.println("------RENTAL MOBIL------");
        System.out.println("Rental Mobil Rp 200.000/hari");
        System.out.println("Persyaratan Rental Mobil Sebagai Berikut : ");
        System.out.println("1.Mengisi Formulir Peminjaman");
        System.out.println("2.Fotocopy KTP ");
        System.out.println("3.Fotocopy SIM");

        System.out.print("ketik YA jika anda Menyetujui Persyaratan Berikut : ");
        pinjam = input.next();
        while (pinjam.toLowerCase().equals("ya")) {
            System.out.println("-----Mengisi Formulir Peminjaman-----");
            System.out.print("Nama            : ");
            nama = input.next();
            System.out.print("merk Mobil      : ");
            merk = input.next();
            System.out.print("Tanggal Pinjam  : ");
            tgl = input.nextInt();
            System.out.print("Tanggal Kembali : ");
            kemb = input.nextInt();
            System.out.print("Plat Nomor      : ");
            plat = input.next();

            System.out.println("");
            System.out.println("jika formulir sudah di isi,fotocopy KTP dan fotocopy SIM  sudah lengkap.");
            System.out.print("ketik YA jika Sudah Memenuhi Semua Persyaratan Berikut : ");
            pinjam = input.next();
            while (pinjam.toLowerCase().equals("ya")) {
                System.out.println("");
                denda = (kemb - tgl - 5) * 100000;
                if (kemb <= tgl + 5) {
                    System.out.println("=====Sukses. Anda Sudah Berhasil Melakukan Rental Mobil=====");
                    System.out.println("Nama            : " + nama);
                    System.out.println("merk Mobil      : " + merk);
                    System.out.println("Tanggal Pinjam  : " + tgl);
                    System.out.println("Tanggal Kembali : " + kemb);
                    System.out.println("Plat Nomor      : " + plat);
                    System.out.println("Anda tidak Terkena Denda");
                    waktu = kemb - tgl;
                    total = waktu * 200000;
                    System.out.println("Biaya Penyewaan Selama " + waktu + " Hari Rp. " + total);

                } else {
                    System.out.println("=====Sukses. Anda Sudah Berhasil Melakukan Rental Mobil=====");
                    System.out.println("Nama            : " + nama);
                    System.out.println("merk Mobil      : " + merk);
                    System.out.println("Tanggal Pinjam  : " + tgl);
                    System.out.println("Tanggal Kembali : " + kemb);
                    System.out.println("Plat Nomor      : " + plat);
                    System.out.println("Denda           : " + denda);
                    waktu = kemb - tgl;
                    total = waktu * 200000;
                    td = denda + total;
System.out.println("Biaya Penyewaan Selama " + waktu + " Hari Rp. " + total+ " Anda terkena Denda Jadi Totalnya : "+td);

                }

                break;
            }
            System.out.println("");
            System.out.print("ketik YA jika Datanya  Kurang Tepat  : ");
            pinjam = input.next();
        }

        //pengembalian mobil
        System.out.println("");
        System.out.println("");

        System.out.println("Pengembalian Rental Mobil Harus Mengecek Identitas Sebelumnya : ");
        System.out.print("Ketik Ya jika Mau Mengembalikan Mobil : ");
        pinjam = input.next();
        while (pinjam.toLowerCase().equals("ya")) {
            System.out.print("Nama            : ");
            pin = input.next();
            System.out.print("merk Mobil      : ");
            pin = input.next();
            System.out.print("Tanggal Pinjam  : ");
            pin = input.next();
            System.out.print("Tanggal Kembali : ");
            pin = input.next();
            System.out.print("Plat Nomor      : ");
            pin = input.next();

            if (plat.toLowerCase().equals(pin.toLowerCase()) ) {
                System.out.println("Identitas Anda Terdaftar ");
                System.out.println("Mobil Sudah Di Kembalikan ");
                System.out.println("Terima Kasih Sudah Menyewa Di Rental Mobil Kami");

            } else {
                System.out.println("Maaf Identitas Anda tidak terdaftar. ulangi lagi");
                System.out.println("");
                System.out.println("");
            }
            System.out.println("ketik ya jika Ingin di ulangi : ");
            pinjam = input.next();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("----------Program Berakhir----------");
    }
}
