package kelas_terbuka;
import java.util.*;
public class materi13{
    public static void main(String[]args){
        String input;
          Scanner input2 = new Scanner(System.in);
          
          System.out.print("Panggil Nama teman kamu : ");
          input = input2.next();
          
          switch  (input){
              case "insani" :
                  System.out.println("insani");
                  break;
               case "alisia" :
                  System.out.println("alisia");
               default :
                   System.out.println("semua nya salah");
               
               
          }
          System.out.println("akhir dari program");
                  
    }
}