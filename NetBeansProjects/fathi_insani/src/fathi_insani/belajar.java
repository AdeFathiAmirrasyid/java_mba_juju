package fathi_insani;

import java.util.Arrays;

public class belajar {

    public static void main(String[] args) {

        int matriks_a[][] = {{3,2,2},{3,5,2,4}} ;
        int matriks_b[][] = {{2,2,1},{2,3,1,1}};
        int matriks_c[][] = new int [3][4];
        
        System.out.println(" Matriks_A ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriks_a[i][j]);
            }
        }
    }
}
