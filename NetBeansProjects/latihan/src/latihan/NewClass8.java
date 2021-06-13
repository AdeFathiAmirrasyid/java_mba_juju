package latihan;

import java.util.Scanner;

public class NewClass8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang, nama1, nopol1;
        int tgl, lama;

        do {
            System.out.println("--------- Rental Mobil ----------");
            System.out.println(" Isi Formulir Rental Mobil  ");
            System.out.print("Input nama : ");
            nama1 = input.next();
            System.out.print("nopol : ");
            nopol1 = input.next();
            System.out.print("tanggal sewa : ");
            tgl = input.nextInt();
            System.out.print("Lama Sewa : ");
            lama = input.nextInt();

            System.out.println("ketik ya jika  data kurang tepat : ");
            ulang = input.next();
        } while (ulang.toLowerCase().equals("ya"));

        System.out.println("Ketik ya jika ingin mengembalaikan mobil : ");
        String jawab = input.next();

        if (jawab.toLowerCase().equals("ya")) {
            System.out.println("Proses Pengembalian mobil");
            System.out.print("Input nama : ");
            String nama2 = input.next();
            System.out.print("nopol : ");
            String nopol2 = input.next();
            System.out.print("tanggal Kembali : ");
            int tglkembali = input.nextInt();
            //Cek Nama dan nopol 
            if (nama1.toLowerCase().equals(nama2) && nopol1.toLowerCase().equals(nopol2)) {
                System.out.println(" identitas falid ");
                int lamasewa = tglkembali - tgl;
                //proses total sewa 
                int denda = lamasewa > lama ? (lama - (lamasewa)) * 50000 : 0;
                int total = lamasewa * 200000;
                System.out.println("Biaya total sewa   Rp " + total);
                System.out.println("denda RP " + denda);
            } else {
                System.out.println(" identitas tidak falid");
            }

        }

        System.out.println("----- Program Berakhir -----");

    }

}
