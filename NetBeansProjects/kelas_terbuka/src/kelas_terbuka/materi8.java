package kelas_terbuka;
import java.util.*;
public class materi8{
    public static void main(String[]args){
    
    //Membuat Program Tebak Angka
    Scanner input = new Scanner(System.in);
    int benar = 7 ;
    int tebakan;
    boolean status;
    
        System.out.print("Masukan Nilai Tebakan : ");
        tebakan =input.nextInt();
        System.out.println("Nilai tebakan Kamu : " + tebakan);
        
        status = (benar == tebakan);
        System.out.println("Nilai tebakan Kamu : "+status);
        
        //Operasi Aljabar boolean ( And / Or)
        System.out.print("Masukan Nilai diantara 12 dan 17 : ");
        tebakan=input.nextInt();
        status = (tebakan >12) && (tebakan<17);
        System.out.println("Nilai Kamu : " +status);
        
        
    
    }
}