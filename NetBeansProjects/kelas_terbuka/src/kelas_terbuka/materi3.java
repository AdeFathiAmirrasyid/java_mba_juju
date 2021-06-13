package kelas_terbuka;
    public class materi3 {
        public static void main(String[]args){
            
           //Unary ada 5
           
           //1. Unary plus dan Minus
           int a = 7;
            System.out.printf(" Unary dari %d menjadi %d \n ",a,+a);
            System.out.printf("Unary dari %d menjadi %d \n ",a,-a);
           
            //Increment dan Decrement
            int b = 11;
            b++;
            System.out.println("Nilai Unary menjadi = "+b);
            
            int c = 11;
            c--;
            System.out.println(" Nilai Unary Menjadi = "+c);
            
            // prefix dan postfix
            int x =12;
            System.out.printf("Nilai prefix ialah = %d \n",++x);
            int y =12;
            System.out.printf(" Nilai postfix ialah = %d \n",y++);
            System.out.printf(" Nilai postfix ialah = %d \n",y);
            
            //boolean 
            boolean insani = true;
            System.out.println("Nilai Boolean insani = "+insani);
            System.out.println("Nilai Boolean insani = "+ !insani);
        }
    
}
