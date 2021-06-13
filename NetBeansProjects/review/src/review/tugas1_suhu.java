package review;

import java.util.Scanner;

public class tugas1_suhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Konfersi Suhu ");

        System.out.println(" Celsius Menjadi Reamur ");
        System.out.print(" Celsius -> Reamur : ");
        int celsius = input.nextInt();
        System.out.print(" Celsius -> farenheat : ");
        int fahrenheat = input.nextInt();

        double hasil = 0.8 * celsius;
        System.out.println(" hasil konversi celsius -> Reamur = " + hasil);
        hasil = 1.8 * celsius + 32;
        System.out.println(" hasil konversi celsius -> Fahrenheat = " + hasil);

    }

}
