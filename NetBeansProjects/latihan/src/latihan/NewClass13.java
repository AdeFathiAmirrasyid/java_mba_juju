package latihan;

import java.util.Scanner;

public class NewClass13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========== Program Rumus Matematika ==========");
        System.out.println("   5.LIMAS SEGITIGA     6.SILINDER         ");
        System.out.println("   7.KERUCUT            8.BOLA ");
        int user;
        String ulangi;
        do {
            System.out.print("Pilih 5 -  8  : ");
            user = input.nextInt();
            switch (user) {
                case 5:
                    limasSegitiga();
                    break;
                case 6:
                    silinder();
                    break;
                case 7:
                    System.out.println("");
                    System.out.println(" ===== 7.KERUCUT ===== ");
                    System.out.println(" Rumus Volume Kerucut -> V = 1/3 x phi x r2 x t ");
                    System.out.print(" jari - jari Kerucut: ");
                    int jariKerucut = input.nextInt();
                    System.out.print(" Tinggi Kerucut      : ");
                    int tinggiKerucut = input.nextInt();
                    double volumeKerucut = kerucut(jariKerucut,tinggiKerucut);
                    System.out.println(" Volume Kerucut " + volumeKerucut);
                    System.out.println("");
                    break;
                case 8:
                    System.out.println(" ===== 8.BOLA ===== ");
                    System.out.println(" Rumus Volume Bola -> V = 4/3 x p x phi x r3 ");
                    System.out.print(" jari - jari Bola: ");
                    int jariBola = input.nextInt();
                    double volumeBola = bola(jariBola);
                    System.out.println(" Volume Bola " + volumeBola);
                    break;
                default:
                    System.out.println(" Selain itu Tidak Ada ");
                    break;
            }
            System.out.print("Ketik ya Jika Ingin Mengulangi : ");
            ulangi = input.next();
        } while (ulangi.toLowerCase().equals("ya"));
    }

    private static void limasSegitiga() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println(" ===== 5.LIMAS SEGITIGA ===== ");
        System.out.println(" Rumus Volume Limas SetiTiga -> v = 1/3 * Luas Alas * Tinggi ");
        System.out.print(" Luas Alas : ");
        int luasAlas = input.nextInt();
        System.out.print(" Tinggi    : ");
        int tinggiLimas = input.nextInt();
        double p = 0.33;
        double volumeLimas = p * luasAlas * tinggiLimas;
        System.out.println(" Volume Limas SegiTiga " + volumeLimas);
        System.out.println("");
    }
    private static void silinder() {
        System.out.println("");
        Scanner input1 = new Scanner(System.in);
        System.out.println(" ===== 6.TABUNG(SILINDER) ===== ");
        System.out.println("Rumus Volume Silinder -> V = p x r2 x t ");
        System.out.print(" jari - jari Tabung : ");
        int jariTabung = input1.nextInt();
        System.out.print(" Tinggi Tabung      : ");
        int tinggiTabung = input1.nextInt();
        double p = 3.14;
        double volumeTabung = p * jariTabung * jariTabung * tinggiTabung;
        System.out.println("Volume Balok Tabung  = " + volumeTabung);
        System.out.println("");

    }

    private static double kerucut(int jariKerucut, int tinggiKerucut) {
        double phi = 3.14;
        double p = 0.33;
        double volumeKerucut = p * phi *  jariKerucut * jariKerucut * tinggiKerucut;
        return volumeKerucut;
    }

    private static double bola(int jariBola) {
        double phi = 3.14;
        double p = 1.3;
        double volumePrisma = p * phi * jariBola * jariBola * jariBola;
        return volumePrisma;
    }

}
