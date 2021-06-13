package fathi_insani;
import java.util.*;
import java.util.Arrays;
public class latihan111{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array1[] = {5,3,1,7,6,9,2,4,8,10};
        int cari;
        System.out.print("Masukan Nilai dicari [1-10] : ");
        cari = input.nextInt();
        fungsiCari(array1,cari);
        System.out.println(Arrays.toString(array1)); 
        
        // sorting
        int array2 []={4,2,6,4,7,3,21,14,51,14,1,23,44,15,16,13,1};
        urutkan(array2);
        int array3[]={1,2,3,4,5};
        int array4[]={1,2,3,4,5};
         tambah(array3,array4);
         gabung(array3,array4); 
    }

    private static void fungsiCari(int dataArray[],int dicari){
    for (int i=0; i < dataArray.length;i++){
    if(dataArray[i] == dicari){
        System.out.println(dataArray[i]+"Berada di index ke - "+i); 

            }
        }
    } 

    private static void urutkan(int dataArray[]){
    int tukar ;
        System.out.println(Arrays.toString(dataArray));
        
            for (int i = 0; i < dataArray.length;i++){
                for(int j=0; j < dataArray.length;j++){
                    
                    if (dataArray[i] < dataArray[i]){
                    tukar = dataArray[i];
                    dataArray[i]=dataArray[i];
                    dataArray[i]=tukar;
                           }
                       }
                   }  
            System.out.println(Arrays.toString(dataArray));
          }
    private static void tambah (int dataArray1[],int dataArray2[]){
    int hasil[] = new int [5];
        System.out.println(Arrays.toString(dataArray2));
        System.out.println("-------------------+");
        for(int i = 0; i < dataArray1.length; i++){
            hasil[i]=dataArray1[i]+dataArray2[i];
        }
        System.out.println(Arrays.toString(hasil));
    }
    private static void gabung (int dataArray1[],int dataArray2[]){
    int hasil[] = new int [10];
    for(int i=0;i<dataArray1.length+dataArray2.length;i++){
        if (i<5){
                hasil[i]=dataArray1[i];
            }else {
        hasil[i]=dataArray2[i-dataArray1.length];    
          }
        
      }
    System.out.println(Arrays.toString(hasil));
    }
            
   
}