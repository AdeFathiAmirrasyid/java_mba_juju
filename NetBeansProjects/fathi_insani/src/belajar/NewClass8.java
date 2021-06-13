package belajar;

public class NewClass8 {

    public static void main(String[] args) {
        int angka[] = {9, 5, 2, 8, 6, 3, 1, 7, 4, 11, 10};
        int data = 8;
        System.out.println(sequensial(angka, data));
        
        int result = recursive(2,3);
        System.out.println(" 2 pangkat 3 = "  + result);

    }

    private static int sequensial(int[] angka, int data) {
        for (int i = 0; i < 11; i++) {
            if (data == angka[i]) {
                return i;
            }
        }
        return -1;
    }
    private static int recursive (int a,int n){
        if (n == 1){
            return a;
        }else {
        return recursive(a, n-1);
        }
    
    
    
    }

}
