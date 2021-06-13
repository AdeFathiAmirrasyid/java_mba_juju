package belajar;
public class NewClass11 {
    public static void main(String[] args) {
        
        printArray();
        
    }
    private static void printArray(){
    int array1 [][] = {
        {1,4,2,5},
        {2,3,5,2},
        {3,5,1,4}
    };
    int array2[][] = {
        {3,6,1,3,1},
        {4,5,1,2,1},
        {1,8,2,1,2},
        {2,6,7,3,4}
    };
    int array3 [][] = new int [3][5];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array1[i][j] + " ");
                
            }
            System.out.println("");
        }
        System.out.println(" ");
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array2[i][j] + " ");
                
            }
            System.out.println("");
        }
         
         System.out.println(" ");
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 5; j++) {
                 for (int k = 0; k < 4; k++) {
                   array3[i][j] += array1[i][k] * array2[k][j];
                     
                 }
                   System.out.print(array3[i][j] + " ");
             }
             System.out.println("");
        }
    
    
    }
}
