package latihan;

import java.util.*;

public class NewClass {

    public static void main(String[] args) {

        int random, tebak, jumlah;

        System.out.println("Tebaklah Angka Antara 1-15");
        Scanner input = new Scanner(System.in);
        jumlah = 0;
        random = 11;
        do {
            jumlah++;
            System.out.println("Masukan Tebakan Anda : ");
            tebak = input.nextInt();
            if (tebak > random) {
                System.out.println("Tebakan Terlalu Besar");
            } else if (tebak < random) {
                System.out.println("Tebakan Terlalu Kecil");
            } else if (random == 11) {
                System.out.println("Tebakan Anda Benar ! Setelah " + jumlah + " Kali Menebak ");

            }

        } while (tebak != random);

    }

}
