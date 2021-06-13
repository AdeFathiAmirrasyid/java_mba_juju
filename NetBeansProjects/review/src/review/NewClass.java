package review;

public class NewClass {

    public static void main(String[] args) {
        int i,j,all;
        for (i = 1; i<=3; i++) {
            for (j = 0;  j<=3; j++) {
                all = i*j;
                if (i==2)break;
                System.out.println(i+"*" + j+ "=" + all);
                    
             
            }
            
        }
      
    }
}
