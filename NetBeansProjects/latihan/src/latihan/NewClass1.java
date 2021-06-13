package latihan;

import java.util.*;

public class NewClass1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin;
        int a, b = 5000000, c = 100;

        System.out.print(" Masukan Kartu ATM : ");
        pin = input.next();
        while (pin.toLowerCase().equals("sudah")) {

            System.out.print("Pilih Bahasa Indonesia Atau Bahasa Inggris : ");
            pin = input.next();
            while (pin.toLowerCase().equals("indonesia")) {

                System.out.print("Masukan Pin : ");
                pin = input.next();
                while (pin.toLowerCase().equals("sandi")) {

                    System.out.println("        Tampilan Mesin ATM   ");
                    System.out.println(" 1 = 100.000         1.000.000 = 5 ");
                    System.out.println(" 2 = 200.000         1.500.000 = 6 ");
                    System.out.println(" 3 = 300.000         2.000.000 = 7 ");
                    System.out.println(" 4 = 500.000     Transaksilain = 8 ");

                    System.out.print("Pilih Jumlah Paket Tunai : ");
                    a = input.nextInt();
                    while (a < 9) {
                        if (a == 1) {
                            System.out.println(" Anda Mengambil Uang Sebesar Rp.100.000 ");
                            return;
                        } else if (a == 2) {
                            System.out.println(" Anda Mengambil Uang Sebesar Rp.200.000 ");
                            return;
                        } else if (a == 3) {
                            System.out.println(" Anda Mengambil Uang Sebesar Rp.300.000 ");
                            return;
                        } else if (a == 4) {
                            System.out.println(" Anda Mengambil Uang Sebesar Rp.500.000 ");
                            return;
                        } else if (a == 5) {
                            System.out.println(" Anda Mengambil Uang Sebesar Rp.1.000.000 ");
                            return;
                        } else if (a == 6) {
                            System.out.println(" Anda Mengambil Uang Sebesar Rp.1.500.000 ");
                            return;
                        } else if (a == 7) {
                            System.out.println(" Anda Mengambil Uang Sebesar Rp.2.000.000 ");
                            return;
                        } else if (a == 8) {
                            System.out.println("           Transaksi Lain ");
                            System.out.println("        Pilih Jenis Transaksi   ");
                            System.out.println(" 1 = Penarikan         Inforekening = 5 ");
                            System.out.println(" 2 = Transfer          Pembayaran   = 6 ");
                            System.out.println(" 3 = Pembelian         Ubah Pin     = 7 ");
                            System.out.println(" 4 = Lainnya           Keluar       = 8 ");
                            System.out.print(" Pilih Jenis Transaksi : ");
                            a = input.nextInt();
                            while (a < 9) {
                                if (a == 1) {
                                    System.out.println(" Anda Memilih Penarikan ");

                                    return;
                                } else if (a == 2) {
                                    System.out.println(" Anda Memilih Transfer ");
                                    return;
                                } else if (a == 3) {
                                    System.out.println(" Anda Memilih Pembelian ");
                                    return;
                                } else if (a == 4) {
                                    System.out.println(" Anda Memilih Lainnya ");
                                    return;
                                } else if (a == 5) {
                                    System.out.println(" Anda Memilih Inforekening ");
                                    System.out.println(" 1 = MUTASI REKENING   INFO SALDO = 3");
                                    System.out.println(" 2 = BRI POIN ");
                                    System.out.print(" PILIH  : ");
                                    a = input.nextInt();
                                    switch (a) {
                                        case 1:
                                            System.out.println("  MUTASI REKENING ");
                                            return;

                                        case 2:
                                            System.out.println("  BRI Poin : " + c);
                                            return;

                                        case 3:
                                            System.out.println(" Saldo Anda : " + b);
                                            return;
                                    }
                                    return;
                                } else if (a == 6) {
                                    System.out.println(" Anda Memilih Pembayaran ");
                                    return;
                                } else if (a == 7) {
                                    System.out.println(" Anda Memilih Ubah Pin ");

                                    return;
                                } else if (a == 8) {
                                    System.out.println(" Anda Memilih Keluar ");
                                    return;
                                }
                            }
                            return;
                        } else {
                            System.out.println("Selain Itu Tidak Ada ");
                            return;
                        }
                    }
                }
            }
        }
    }
}
