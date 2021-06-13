package fathi_insani;

import java.util.*;

public class gggg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int celcius;
        double fahrenheit, reamur;

        System.out.print("Suhu celcius : ");
        celcius = input.nextInt();
        fahrenheit = (celcius * 9 / 5) + 32;
        reamur = (celcius * 4 / 5);
        System.out.println("Menghitung Konversi Suhu");
        System.out.println("Celcius ke farenheit dan reamur");

        System.out.println("Celcius ke fahrenheit : " + fahrenheit);
        System.out.println("Celcius ke reamur : " + reamur);

    }

}
