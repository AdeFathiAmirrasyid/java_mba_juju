package latihan;

import java.util.Arrays;

public class NewClass15 {

    public static void main(String[] args) {
        int matriksA[] = {3, 5, 2, 4};
        int matriksB[] = {2, 3, 1, 1};
        
        int hasilMatriks []= penjumlahanMatriks(matriksA,matriksB);
        matriks(matriksA);
        matriks(matriksB);
        matriks(hasilMatriks);
        System.out.println("");
        int h_Matriks []= penguranganMatriks(matriksA,matriksB);
        matriks(matriksA);
        matriks(matriksB);
        matriks(h_Matriks);
        
        

    }
    private static void  perkalianMatriks(int matriksX []){
        int matriksC [] = new int [matriksX.length];
        for(int i = 0; i < matriksX.length;i++){
            matriksC[i] = matriksX[i] * 2;
        }
    }
    private static int [] penguranganMatriks(int matriks_A [] , int matriks_B []){
        int h_Matriks[] = new int[matriks_A.length];
        for (int i = 0; i < matriks_A.length; i++) {
            h_Matriks[i] = matriks_A[i] - matriks_B[i];  
        }
         return h_Matriks;
    }
    private static int[] penjumlahanMatriks(int matrikssA [] , int matrikssB[]) {
        int hasilMatriks[] = new int[matrikssA.length];
        for (int i = 0; i < matrikssA.length; i++) {
            hasilMatriks[i] = matrikssA[i] + matrikssB[i];  
        }
         return hasilMatriks;
    }

    private static void matriks(int dataMatriks[]) {
        System.out.println(Arrays.toString(dataMatriks));
    }
}
