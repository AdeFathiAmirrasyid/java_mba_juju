package fathi_insani;

import java.util.Arrays;

public class latihanArray1 {

    public static void main(String[] args) {

        int array1[] = {4, 8, 5, 6, 2, 9, 1, 3, 7};
        int array2[] = {5, 7, 8, 4, 2, 3, 9, 1, 6};
        //penjumlahan dua buah array
        int hasil[] = tambahArray(array1, array2);
        printArray(array1);
        printArray(array2);
        printArray(hasil);

        // Menghubungkan Dua buah array 
        int hasil2[] = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            hasil2[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            hasil2[i + array1.length] = array2[i];
        }
        printArray(array1);
        printArray(array2);
        printArray(hasil2);

        // Sorting reverse , Mengurutkan tapi kebalik
        reverse(array1);
        printArray(array1);

        reverse2(array1);
        printArray(array1);

    }

    private static void reverse2(int dataArray[]) {

        Arrays.sort(dataArray);
        int buffer;
        for (int i = 0; i < dataArray.length / 2; i++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;

        }
    }

    private static void reverse(int dataArray[]) {
        Arrays.sort(dataArray);
        int arrayBuffer[] = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }

    }

    private static int[] tambahArray(int arrayInt1[], int arrayInt2[]) {
        int hasil[] = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            hasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return hasil;
    }

    private static void printArray(int dataArray[]) {
        System.out.println(Arrays.toString(dataArray));
    }
}
