package review;

import java.util.Scanner;

public class tugas4_PerulanganBersarang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Tebak Angka 1 - 20 ");
        int tebak,nilai,jumlah;
        jumlah = 0;
        nilai = 15;
        do{
            System.out.print(" Ketik Nilai Tebakan : ");
            tebak = input.nextInt();
            if(tebak > nilai){
                System.out.println(" Nilai Tebakan Terlalu Besar ");
            }else if(tebak < nilai){
                System.out.println(" Nilai Tebakan Terlalu Kecil");
            }
            else if(nilai == 15){
                System.out.println(" Nilai Tebakan Benar");
            }
        
        }while(tebak != nilai);
        
        
        
        int i = 0;
        while (i < 10){
            System.out.println(" i ke - " + i);
            i++;
        }
        
        for (int k = 0; k < 5; k++) {
            for (int j = 0; j < 5; j++) {  
                 if((k >= j) ){
                     System.out.print("*");
                 }
            } 
              System.out.println("");
        } 
    }

}
