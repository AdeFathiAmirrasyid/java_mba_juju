package latihan;
import java.util.*;
public class belajar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       int count = 1, hargaBarang = 0, jumlahBarang = 0, totalHarga = 0;
        String namaBarang = "", tambahBarang = "";      
        
        //kasir
        do{
            System.out.println("barang ke- " + count);
            System.out.println("nama brg = ");
            namaBarang = input.next();
            System.out.println("harga brg = ");
            hargaBarang = input.nextInt();
            System.out.println("Jumlah brg = ");
            jumlahBarang = input.nextInt();
            totalHarga += hargaBarang * jumlahBarang;
            
            System.out.println("input barang lagi? ya");
            tambahBarang = input.next();
            count++;
        }while(tambahBarang.toLowerCase().equals("ya"));
        
        
        System.out.println("Jumlah yang harus di bayar = " + totalHarga);
        
        
        
       
    }
    
}
