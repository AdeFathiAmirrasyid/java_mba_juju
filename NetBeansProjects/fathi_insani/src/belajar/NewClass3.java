package belajar;

public class NewClass3 {

    public static void main(String[] args) {

        int[][] a = {
            {4, 5, 2},
            {5, 2, 7},
            {9, 3, 6},
            {4, 7, 6}};
        
        System.out.println(" Matriks Awal");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a [i][j]+ " ");
            }
            System.out.println("");
        }
        
        
        System.out.println(" Matriks transpose");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a [j][i]+ " ");
            }
            System.out.println("");
        }
    }
}
