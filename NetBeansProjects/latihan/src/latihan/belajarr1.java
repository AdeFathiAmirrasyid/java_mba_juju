package latihan;
import java.util.*;
public class belajarr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Konversi Nilai Huruf (86 - 100 A, 71 - 85 B, 51 - 70 C, 0-50 Gagal) selain itu Nilai Salah
       
        System.out.print("Masukan Nilai : ");
         int a = input.nextInt();
        if( a >= 86 && a <= 100){
            System.out.println("Selamat Anda Mendapatkan Nilai A");
        } else if (a >= 71 && a <= 85){
            System.out.println("Selamat Anda Mendapatkan Nilai B");
        
        }else if (a >= 51 && a <= 70){
            System.out.println(" Anda Mendapatkan Nilai C");
        
        } else {
            System.out.println(" Anda tidak lulus");
        }
        
        
        
        
        
    }
    
}
