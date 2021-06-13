package belajar;

public class NewClass9 {

    public static void main(String[] args) {
        int[] angka = {9, 4, 16, 1, 2, 6, 5, 34, 56, 21, 11};
        int index = 6;
        System.out.println(" Sequensial Search");
        System.out.println(SequensialSearch(angka,index));
    }

    private static int SequensialSearch(int angka[], int index) {
        for (int i = 0; i < 12; i++) {
            if (index == angka[i]) {
                return i;
            }
        }
        return -1;
    }

}
