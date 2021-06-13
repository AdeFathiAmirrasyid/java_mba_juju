package latihan;
import java.util.*;
public class tugas6 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String sudah;
     
     //Contoh Program Mesin ATM
     
        System.out.print(" Masukan Kartu ATM : ");
        sudah = input.next();  
                    
        System.out.print("Pilih Bahasa Indonesia Atau Bahasa Inggris : ");
        sudah = input.next();
      
        System.out.print("Masukan Pin : ");
        sudah = input.next();
        
     do{
         
        System.out.println("   Pilih Jumlah Paket Tunai   ");
        System.out.println(" 1 = 100.000         1.000.000 = 5 ");
        System.out.println(" 2 = 200.000         1.500.000 = 6 ");
        System.out.println(" 3 = 300.000         2.000.000 = 7 ");
        System.out.println(" 4 = 500.000     Transaksilain = 8 ");
        
        
//         if(a == 1 ){
//                    System.out.println(" 100.000 ");
//                }else if(a == 2){
//                    System.out.println(" 200.000 ");
//                }
//       switch (a) {
////            case 1:
//                System.out.println("100.000");
//            case 2:
//                System.out.println("200.000");
//                break;
//            case 3:
//                System.out.println("300.000");
//                break;
//            case 4:
//                System.out.println("500.000");
//                break;
//            case 5:
//                System.out.println("1.000.000");
//                break;
//            case 6:
//                System.out.println("1.500.000");
//                break;
//            case 7:
//                System.out.println("2.000.000");
//                break;
//            case 8:
//                System.out.println("Transaksilain");
//                break;
//            default:
//                System.out.println("Tidak Ada ");
//        
     }while(sudah.toLowerCase().equals("sudah"));
            
    }
}
