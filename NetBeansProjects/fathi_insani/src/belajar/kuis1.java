package belajar;

import java.util.Scanner;

public class kuis1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user;
        int i = 0;
        String ulangi;
        do {
            i++;
            System.out.print(" input Number 1 - 12 : ");
            user = input.nextInt();
            switch (user) {
                case 1:
                    System.out.println(" January - 31 hari");
                    break;
                case 2:
                    System.out.println(" february - 29 hari");
                    break;
                case 3:
                    System.out.println(" Maret  - 30 hari");
                    break;
                case 4:
                    System.out.println(" April - 31 hari ");
                    break;
                case 5:
                    System.out.println(" Mei - 30 hari");
                    break;
                case 6:
                    System.out.println(" juni - 31 hari ");
                    break;
                case 7:
                    System.out.println(" Juli - 30 hari ");
                    break;
                case 8:
                    System.out.println(" Agustus - 31 hari ");
                    break;
                case 9:
                    System.out.println(" September - 30 hari ");
                    break;
                case 10:
                    System.out.println(" Oktober - 31 hari ");
                case 11:
                    System.out.println(" November - 30 hari ");
                    break;
                case 12:
                    System.out.println(" Desember - 31 hari");
                    break;
                default : 
                    System.out.println(" Selain itu Tidak Ada ");

            }
            System.out.println(" ketik Ya jika ingin Mengulangi");
            ulangi = input.next();
        } while (ulangi.toLowerCase().equals("ya"));
    }

}
