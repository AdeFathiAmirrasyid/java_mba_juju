package fathi_insani;

import java.util.*;

public class ass {

    public static void main(String[] args) {
        //menentukan bilangan terbesar dari 3 buah bilangan
        Scanner input = new Scanner(System.in);
        int pertama, kedua, ketiga, terbesar;

        System.out.print("masukan nilai pertama : ");
        pertama = input.nextInt();
        System.out.print("masukan nilai kedua : ");
        kedua = input.nextInt();
        System.out.print("masukan nilai ketiga : ");
        ketiga = input.nextInt();

        if (pertama > kedua && pertama > ketiga) {
            terbesar = pertama;
        } else if (kedua > ketiga) {
            terbesar = kedua;
        } else {
            terbesar = ketiga;
        }
        System.out.println("bilangan terbesar adalah : " + terbesar);
    }
}
