package fathi_insani;
    import java.util.*;
    public class latihan {
        public static void main(String[]args){
       
            Scanner input = new Scanner(System.in);
            int nilaiAwal,nilaiAkhir,total;
            System.out.print("Masukan Nilai Awal : ");
            nilaiAwal =input.nextInt();
            System.out.print("Masukan Nilai Akhir ");
            nilaiAkhir = input.nextInt();
            
            total = 0;
               
          for(int i = nilaiAwal; nilaiAwal<=10; nilaiAwal++){
             total = total+ nilaiAwal;
             System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
          }
                        
            }

        }
