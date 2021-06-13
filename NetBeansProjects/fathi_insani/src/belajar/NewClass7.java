package belajar;

public class NewClass7 {

    public static void main(String[] args) {

        System.out.println(" perpangkatan rekursif ");
        int hasil = rekursifPerpangkatan(2, 3);
        System.out.println("2 pangkat 3 =  " + hasil);
    }

    private static int rekursifPerpangkatan(int a, int n) {
        if (n == 1) {

            return a;
        } else {
            return a * rekursifPerpangkatan(a, n - 1);
        }
    }

    private static int faktorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * faktorial(n - 1);
        }
    }

}
