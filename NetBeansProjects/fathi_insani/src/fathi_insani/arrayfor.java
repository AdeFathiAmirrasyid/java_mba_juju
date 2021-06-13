package fathi_insani;
class arrayfor{
    public static void main(String[]ars){
        System.out.println("Latihan Array dengan For");
        
        int angka[]={1,2,3,4,5,6,7,8,9,10,100};
        
            System.out.println("Looping standar");
            for(int j = 0; j < 5 ;j++){
            System.out.println("index ke  : " +j+" adalah " + angka[j]);
            }      System.out.println("looping proprtis"); 
            for(int i = 0; i < angka.length; i++){
                System.out.println("indek ke - " +i+" ialah " +angka[i]);
            }
            
            System.out.println("looping for each");
            for(int dialah : angka ){
                System.out.println("angka = " +dialah);
            }
    }
}