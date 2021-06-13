package review;

import java.util.Scanner;

public class tugas2_nilaiKehuruf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Masukan Nilai : ");
        int nilai = input.nextInt();
        if(nilai >= 86  && nilai <=100 ){
            System.out.println(" Nilai A ");
        } else if (nilai >= 71 && nilai <= 85){
             System.out.println(" Nilai B ");
        }else if (nilai >= 51 && nilai <= 70){
             System.out.println(" Nilai C ");
        }else if (nilai >= 0 && nilai <= 50){
             System.out.println(" Gagal ");
        }else {
            System.out.println(" Selain Itu salah");
        }
        System.out.println(" Program Selesai ");
    }

}
