package belajar;

public class NewClass4 {

    public static void main(String[] args) {

        int[][] matriks_a = {{4, 5, 2, 3, 2, 1, 4},
                             {5, 2, 7, 1, 2, 2, 1},
                             {9, 3, 6, 2, 4, 2, 3},
                             {4, 7, 6, 8, 2, 6, 2}};
        
        int[][] matriks_b = {{1, 2, 2},
                             {3, 2, 1},
                             {2, 3, 4},
                             {1, 3, 1},
                             {1, 2, 1},
                             {1, 2, 4},
                             {4, 1, 6}};
        
        int[][] matriks_c = new int[4][3];
        
        System.out.println(" Matriks A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriks_a[i][j] + " ");               
            }
            System.out.println("");
        }
        System.out.println(" Matriks B");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks_b[i][j] + " ");               
            }
            System.out.println("");
        }
        
        System.out.println(" Hasil Perlian Matriks A dan B");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 7 ; k++) {
                        matriks_c[i][j] +=matriks_a[i][k] * matriks_b [k][j]; 
                    }
                    System.out.print(matriks_c [i][j]+ " ");
                }
                System.out.println("");
        }

    }
}
