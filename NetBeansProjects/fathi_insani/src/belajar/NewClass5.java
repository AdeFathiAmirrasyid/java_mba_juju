
public class NewClass5 {

    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30, 40, 50},
            {15, 25, 35, 45, 55},
            {60, 70, 80, 90, 100},
            {65, 75, 85, 95, 105},};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
         System.out.println("");
         
        for (int i = 0 ; i < matrix.length; i++) {
                for (int j = 0 ; j < matrix.length; j++) {
                    if(i >= j){
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println("");
            }

        }
    }


