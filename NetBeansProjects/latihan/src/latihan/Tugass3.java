package latihan;
import java.util.*;
public class Tugass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int angka;
        
        System.out.println("-----Pilih Warna : merah,hijau,kuning -----");
        System.out.print("Masukan Warna : ");
        nama = input.next();
        System.out.print("Masukan Angka : ");
        angka= input.nextInt();
        switch (nama){
            case "merah" :
                 System.out.println("Warna Merah Tandanya Berhenti");
                 if(angka >= 80 && angka <= 1000){
                     System.out.println("kamu harus menunggu ");
                 }else if (angka >= 60 && angka <= 79){
                 System.out.println("kamu harus jalan");
                 }else if (angka >40 && angka <=59){
                     System.out.println("kamu harus menunggu aba-aba berhenti");
                 }else {
                     System.out.println("Angka belom Tersedia");
                 }
                     
                 break;
            case "hijau" :
                 System.out.println("Warna Hijau Tandanya Jalan");
                 
                 if(angka >= 80 && angka <= 1000){
                     System.out.println("kamu harus menunggu ");
                 }else if (angka >= 60 && angka <= 79){
                 System.out.println("kamu harus jalan");
                 }else if (angka >40 && angka <=59){
                     System.out.println("kamu harus menunggu aba-aba berhenti");
                 }else {
                     System.out.println("Angka belom Tersedia");
                 }
                 break;
            case "kuning" :
                 System.out.println("Warna kuning Tandanya Mauberhenti");
                 
                 if(angka >= 80 && angka <= 1000){
                     System.out.println("kamu harus menunggu ");
                 }else if (angka >= 60 && angka <= 79){
                 System.out.println("kamu harus jalan");
                 }else if (angka >40 && angka <=59){
                     System.out.println("kamu harus menunggu aba-aba berhenti");
                 }else {
                     System.out.println("Angka belom Tersedia");
                 }
                 break;
            default :
                System.out.println("Selain warna di atas tidak tersedia");
        }
        
    }
    
}
