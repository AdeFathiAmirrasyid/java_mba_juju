package latihan;

import java.util.*;

public class tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String zodiak;

        System.out.println("----- Pilih Angka  1 atau 2 -----");
        System.out.println("----- Pilih Zodiak : aries atau gemini----- ");

        System.out.print("  pilih angka: ");
        pilihan = input.nextInt();
        System.out.print("  pilih doziak: ");
        zodiak = input.next();
        if ((pilihan == 1)) {
            System.out.println(" Kamu Adalah Progremer");
            switch (zodiak.toLowerCase()) {
                case "aries":
                    System.out.println("zodiak kamu Aries");
                    break;
                case "gemini":
                    System.out.println("zodiak kamu Gemini");
                    break;
                default:
                    System.out.println("zodiak anda tidak ada");
            }
        } else if (pilihan == 2) {
            System.out.println(" Kamu Adalah Pembisnis");
            switch (zodiak) {
                case "aries":
                    System.out.println("zodiak kamu Aries");
                    break;
                case "gemini":
                    System.out.println("zodiak kamu Gemini");
                    break;
                default:
                    System.out.println("zodiak anda tidak ada");
            }

        }

    }
}
