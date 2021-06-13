package kelas_terbuka;
    public class materi6 {
        public static void main (String[]args){
        
            // Operator Logika
            boolean a,b,c;
            
            System.out.println("    -----OR-----");
            a = true ;
            b = false;
            c = (a || b);
            System.out.println(a+" || " +b+ " --> "+c);
            
            a = false ;
            b = true;
            c = (a || b);
            System.out.println(a+" || " +b+ " --> "+c);
            
            a = true ;
            b = true;
            c = (a || b);
            System.out.println(a+" || " +b+ " --> "+c);
            
            a = false ;
            b = false;
            c = (a || b);
            System.out.println(a+" || " +b+ " --> "+c);
            
            System.out.println("    -----AND-----");
            a = true ;
            b = false;
            c = (a & b);
            System.out.println(a+" & " +b+ " --> "+c);
            
            a = false ;
            b = true;
            c = (a & b);
            System.out.println(a+" & " +b+ " --> "+c);
            
            a = true ;
            b = true;
            c = (a & b);
            System.out.println(a+" & " +b+ " --> "+c);
            
            a = false ;
            b = false;
            c = (a & b);
            System.out.println(a+" & " +b+ " --> "+c);
            
            System.out.println("    -----XOR-----");
            a = true ;
            b = false;
            c = (a ^ b);
            System.out.println(a+" ^ " +b+ " --> "+c);
            
            a = false ;
            b = true;
            c = (a ^ b);
            System.out.println(a+" ^ " +b+ " --> "+c);
            
            a = true ;
            b = true;
            c = (a ^ b);
            System.out.println(a+" ^ " +b+ " --> "+c);
            
            a = false ;
            b = false;
            c = (a ^ b);
            System.out.println(a+" ^ " +b+ " --> "+c);
            
            System.out.println("    -----NEGASI-----");
            
            a = false ;
            b = !a;
            System.out.println(a+" --> (!) =  "+b);
            
            a = true ;
            b = !a;
            System.out.println(a+" --> (!) =  "+b);
            
            
            
            
            
        }
    
}
