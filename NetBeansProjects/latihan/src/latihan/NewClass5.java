package latihan;

import java.util.*;

public class NewClass5 {

    public static void main(String[] args) {
        String nopolA = "";
        String nopolB = "";
        int waktumasuk = 0;
        int waktukeluar = 0;
        System.out.println("Aplikasi parkir sederhana");
        System.out.println("==========================================");
        System.out.println("Biaya Parkir = Rp. 3.000/jam");
        System.out.println("ketik ya untuk ambil tiket masuk parkir"); // ambil tiket
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //untuk waktu masuk
        while (input.toLowerCase().equals("ya")) {
            System.out.println("input nomor polisi ");
            nopolA = sc.next();
            System.out.println("input waktu masuk ");
            waktumasuk = sc.nextInt();

            System.out.println("kendaraan dengan nopol : " + nopolA + " masuk parkir pada jam : " + waktumasuk);

            System.out.println("ketik ya jika ingin mengulang input nopol dan waktu masuk");
            input = sc.next();
        }

        System.out.println("ketik keluar jika anda akan keluar parkir");
        input = sc.next();
        while (input.toLowerCase().equals("ulang") || input.toLowerCase().equals("keluar")) {
            //waktu keluar
            System.out.println("input waktu keluar ");
            waktukeluar = sc.nextInt();
            System.out.println("input nomor polisi");
            nopolB = sc.next();

            //cek nopol
            if (nopolA.toLowerCase().equals(nopolB.toLowerCase())) {
                //proses biaya parkir
                System.out.println("Nomor Polisi terdaftar");
                int waktu = waktukeluar - waktumasuk;
                int totalBiaya = waktu * 3000;
                System.out.println("Biaya Parkir selama " + waktu + " jam = Rp. " + totalBiaya);
                input = "";
            } else {
                System.out.println("nomor polisi tidak terdaftar. ulangi lagi");
                input = "ulang";
            }
        }

        System.out.println("Program selesai");
    }

}
