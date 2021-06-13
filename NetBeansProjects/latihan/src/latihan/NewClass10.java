package latihan;

import java.util.Scanner;

public class NewClass10 {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("========== Program Rumus Matematika ==========");
        System.out.println("   1.KUBUS                 2.BALOK           ");
        System.out.println("   3.LIMAS SEGIEMPAT       4.PRISMA SEGITIGA ");
        int user;
        String ulangi;
        System.out.println("");

        do {
            System.out.print("Pilih 1 - 4  : ");
            user = inputUser.nextInt();
            switch (user) {
                case 1:
                    System.out.println(" ===== 1.KUBUS ===== ");
                    System.out.println(" Rumus Mencari Volume Kubus -> v = s * s * s ");
                    kubus(0, 0, 0);
                    break;
                case 2:
                    System.out.println(" ===== 2.BALOK ===== ");
                    System.out.println("Rumus Mencari Volume Balok -> V = p x l x t ");
                    int volumeBalok = balok(0, 0, 0);
                    System.out.println("Volume Balok = " + volumeBalok);
                    break;
                case 3:
                    System.out.println(" ===== 3.LIMAS SEGIEMPAT ===== ");
                    System.out.println(" Rumus Mencari Volume Limas SegiEmpat -> V = 1/3 x p x l x t ");
                    limasSegiempat(0, 0, 0);
                    break;
                case 4:
                    System.out.println(" ===== 4.PRISMA SEGITIGA ===== ");
                    System.out.println(" Rumus Mencari Volume prisma SegiTiga -> V = 1/2 x p x l x t ");
                    double volumePrisma = prismaSegitiga(0, 0, 0);
                    System.out.println(" Volume Limas " + volumePrisma);

                default:
                    System.out.println(" Selain itu Tidak Ada ");
            }
            System.out.print("Ketik ya Jika Ingin Mengulangi : ");
            ulangi = inputUser.next();
        } while (ulangi.toLowerCase().equals("ya"));
    }

    private static void kubus(int panjangSisi1, int panjangSisi2, int panjangSisi3) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Panjang Sisi Kubus 1 : ");
        panjangSisi1 = input.nextInt();
        System.out.print(" Panjang Sisi Kubus 2 : ");
        panjangSisi2 = input.nextInt();
        System.out.print(" Panjang Sisi Kubus 3 : ");
        panjangSisi3 = input.nextInt();
        int volumeKubus = panjangSisi1 * panjangSisi2 * panjangSisi3;
        System.out.println(" Volume Kubus " + volumeKubus);
        System.out.println("");
        System.out.println(" Mencari Rumus Luas Kubus  ->  L = 6 * s *s ");
        System.out.print(" Panjang Sisi Kubus 1 : ");
        panjangSisi1 = input.nextInt();
        System.out.print(" Panjang Sisi Kubus 2 : ");
        panjangSisi2 = input.nextInt();
        int p = 6;
        int luasKubus = p * (panjangSisi1 * panjangSisi2);
        System.out.println(" Luas Kubus " + luasKubus);

    }

    private static int balok(int panjangBalok, int lebarBalok, int tinggiBalok) {
        Scanner input1 = new Scanner(System.in);
        System.out.print(" Panjang Balok : ");
        panjangBalok = input1.nextInt();
        System.out.print(" Lebar Balok   : ");
        lebarBalok = input1.nextInt();
        System.out.print(" Tinggi Balok  : ");
        tinggiBalok = input1.nextInt();
        int volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
        
        System.out.println(" Rumus Mencari Luas Balok -> luasBalok =  (2 x p x l) + (2 x p x t) + (2 x l x t) ");
        System.out.print(" Panjang Balok : ");
        panjangBalok = input1.nextInt();
        System.out.print(" Lebar Balok   : ");
        lebarBalok = input1.nextInt();
        System.out.print(" Tinggi Balok  : ");
        tinggiBalok = input1.nextInt();
        int p = 2;
        int luasBalok = (p * panjangBalok * lebarBalok) + (p * panjangBalok * tinggiBalok) + (p * lebarBalok * tinggiBalok);
        System.out.println("Luas Balok = " + luasBalok);
        return volumeBalok;
        
        

    }

    private static void limasSegiempat(double p, int luasAlas, int tinggiLimas) {
        Scanner input2 = new Scanner(System.in);
        System.out.print(" Luas Alas : ");
        luasAlas = input2.nextInt();
        System.out.print(" Tinggi Limas : ");
        tinggiLimas = input2.nextInt();
        p = 33.33;
        double volumeLimas = p * luasAlas * luasAlas * tinggiLimas;
        System.out.println(" Volume Limas " + volumeLimas);
    }

    private static double prismaSegitiga(int alasSegitiga, int tinggiSegitiga, int tinggiPrisma) {
        Scanner input3 = new Scanner(System.in);
        System.out.print(" Alas Segitiga : ");
        alasSegitiga = input3.nextInt();
        System.out.print(" Tinggi Segitiga : ");
        tinggiSegitiga = input3.nextInt();
        System.out.print(" Tinggi Prisma : ");
        tinggiPrisma = input3.nextInt();
        double p = 0.5;
        double volumePrisma = p * alasSegitiga * tinggiSegitiga * tinggiPrisma;
        return volumePrisma;
    }
}
