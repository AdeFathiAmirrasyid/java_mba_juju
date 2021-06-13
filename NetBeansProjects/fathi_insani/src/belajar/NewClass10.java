package belajar;

public class NewClass10 {

    public static void main(String[] args) {
        bubbleSort();
    }

    private static void bubbleSort() {
        int[] angka = {9, 4, 16, 1, 2, 6, 5, 34, 56, 21, 11};
        System.out.println(" Array Awal");
        for (int i = 0; i < angka.length - 1; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println("");

        System.out.println(" Bubble Sort");
        for (int a = 0; a < angka.length; a++) {
            for (int i = 0; i < angka.length - 1; i++) {
                if (angka[i] > angka[i+1]) {
                    int temp = angka[i];
                    angka[i] = angka[i + 1];
                    angka[i + 1] = temp;
                }

            }
            
        }
        
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka [i] + " ");
        }
        System.out.println("");
    }

}
