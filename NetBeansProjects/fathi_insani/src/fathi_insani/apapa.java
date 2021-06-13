package fathi_insani;

import java.util.*;

public class apapa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float celsius, fahrenheit, reamur, kelvin;
        System.out.print("masukan derajat celsius ke fahrnheit : ");
        celsius = input.nextInt();

        System.out.print("masukan derajat celsius  ke reamur: ");
        celsius = input.nextInt();

        System.out.print("masukan derajat celsius ke kelvin : ");
        celsius = input.nextInt();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);

        reamur = (celsius * 4 / 5);
        System.out.println("reamur = " + reamur);

        kelvin = (celsius + 273);
        System.out.println("kelvin = " + kelvin);

    }

}
