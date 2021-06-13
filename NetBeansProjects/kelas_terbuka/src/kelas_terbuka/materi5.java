package kelas_terbukai;
    public class materi5 {
        public static void main(String[]args){
          
            // Operator Komparasi
            System.out.println("-----PERSAMAAN-----");
            int a,b;
            boolean hasil ;
            a = 11;
            b = 11;
            hasil =( a == b );
            System.out.printf("%d == %d --> %s \n",a,b,hasil);
            
            a = 12;
            b = 11;
            hasil =( a == b );
            System.out.printf("%d == %d --> %s \n",a,b,hasil);
            
             System.out.println("-----TIDAK PERSAMAAN-----");
            a = 11;
            b = 11;
            hasil =( a != b );
            System.out.printf("%d != %d --> %s \n",a,b,hasil);
            
            a = 12;
            b = 11;
            hasil =( a != b );
            System.out.printf("%d != %d --> %s \n",a,b,hasil);
            
            System.out.println("-----KURANG DARI-----");
            a = 9;
            b = 11;
            hasil =( a < b );
            System.out.printf("%d < %d --> %s \n",a,b,hasil);
            
            a = 12;
            b = 11;
            hasil =( a < b );
            System.out.printf("%d < %d --> %s \n",a,b,hasil);
            
             System.out.println("-----LEBIH DARI DARI-----");
            a = 9;
            b = 11;
            hasil =( a > b );
            System.out.printf("%d > %d --> %s \n",a,b,hasil);
            
            a = 12;
            b = 11;
            hasil =( a > b );
            System.out.printf("%d > %d --> %s \n",a,b,hasil);
            
            System.out.println("-----KURANG DARI SAMADENGAN-----");
            a = 11;
            b = 11;
            hasil =( a <= b );
            System.out.printf("%d <= %d --> %s \n",a,b,hasil);
            
            a = 9;
            b = 11;
            hasil =( a <= b );
            System.out.printf("%d <= %d --> %s \n",a,b,hasil);
            
            a = 12;
            b = 11;
            hasil =( a <= b );
            System.out.printf("%d <= %d --> %s \n",a,b,hasil);
            
              System.out.println("-----LEBIH DARI DARI SAMADENGAN-----");
            a = 11;
            b = 11;
            hasil =( a >= b );
            System.out.printf("%d >= %d --> %s \n",a,b,hasil);
            
            a = 9;
            b = 11;
            hasil =( a >= b );
            System.out.printf("%d >= %d --> %s \n",a,b,hasil);
            
            a = 12;
            b = 11;
            hasil =( a >= b );
            System.out.printf("%d >= %d --> %s \n",a,b,hasil);
        
        }
    
}
