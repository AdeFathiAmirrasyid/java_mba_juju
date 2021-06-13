package review;

import java.util.Scanner;

public class tugas2_volumeTabung {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Menentukan Volume Tabung ");

        System.out.print(" Input Jari - Jari : ");
        int jari2Tabung = input.nextInt();
        System.out.print(" Input Tinggi : ");
        int tinggiTabung = input.nextInt();
        
        double phi = 3.14;
        double hasil = phi * jari2Tabung * jari2Tabung * tinggiTabung;
        System.out.println(" Volume Tabung = "+ hasil);

    }
}
