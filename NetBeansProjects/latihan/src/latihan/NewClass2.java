package latihan;
import java.util.*;
public class NewClass2 {
    public static void main(String[] args) {
       
            Scanner input = new Scanner (System.in);
    String barang;
    int jumlah,harga,a, b, x, total = 0;
    int harga1, harga2, harga3, harga4;
    harga1 = 15000;
    harga2 = 20000;
    harga3 = 10000;
    harga4 = 25000;
    int yesno = 0;
        
    System.out.println("-----DAFTAR MENU-----");
    System.out.println("1.Bakso Urat ..........15000");
    System.out.println("2.Mie Ayam Bakso ......20000");
    System.out.println("3.Mie Ayam ............10000");
    System.out.println("4.Nasi + Ayam Geprek...25000");
    do {
        System.out.println("Silahkan pilih menu makanan:");
        System.out.println("Masukkan jumlah pessanan:");
        jumlah = input.nextInt();a = input.nextInt();
        System.out.println("Masukkan jumlah pessanan:");
        jumlah = input.nextInt();
        if (a == 1) {
            total = harga1 * jumlah;
        }
        else if (a == 2) {
            total = harga2 * jumlah;
        }
        else if (a == 3) {
            total = harga3 * jumlah;
        }
        else if (a == 4) {
            total = harga4 * jumlah;
        }
        System.out.println("Apakah ada pesanan lain, jika ada silahkan pilih daro menu:");
        b = input.nextInt();
        do {
            System.out.println("Masukkan jumlah pessanan:");
            jumlah = input.nextInt();
            if (b == 1) {
                total = total + (harga1 * jumlah);
            }
            else if (b == 2) {
                total = total + (harga2 * jumlah);
            }
            else if (b == 3) {
                total = total + (harga3 * jumlah);
            }
            else if (b == 4) {
                total = total + (harga4 * jumlah);
            }
            System.out.println("Apakah ada pesanan lain, jika ada silahkan pilih daro menu:");
            yesno = input.nextInt();
        }while(yesno != 0);
        System.out.println("Total yang harus dibayar adalah "+ total);
        System.out.println("Apakah kamu mau melanjutkan? Ya = 1 | Tidak = 0");
        yesno = input.nextInt();
    }while(yesno != 0);
        System.out.println("Selesai!");
    }
}  

    
    



