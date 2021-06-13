package fathi_insani;
import java.util.*;
public class latihan2 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int fn,fn1,fn2,n;
        System.out.print("Masukan Nilai fibonaci ke - : ");
        n = input.nextInt();
        
        fn2=0;
        fn1=1;
        fn=1;
        
        for(int a = 1; a<=n; a++){
            System.out.println("Nilai ke - "+a+" menjadi "+fn);
            fn=fn1+fn2;
            fn2=fn1;
            fn1=fn;
        }  
    }
    
}
