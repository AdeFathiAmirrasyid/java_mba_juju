package kelas_terbuka;
import java.util.Scanner;
    public class materi7 {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        int panjang,lebar,luas,tinggi,volume;
        System.out.println("-----MENGHITUNG LUAS PERSEGI PANJANG-----");
        System.out.print("Panjang = ");
        panjang = input.nextInt();
        System.out.print("Lebar = ");
        lebar = input.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas = "+luas);
        
        System.out.println("MENGHITUNG VOLUME");
        System.out.print("Tinggi = ");
         tinggi = input.nextInt();
         volume = luas * tinggi;
         System.out.println("volume = " +volume);
        }
    
    }
        

   